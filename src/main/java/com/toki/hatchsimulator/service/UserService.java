package com.toki.hatchsimulator.service;

import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.persistence.UserRepository;

import java.util.List;
import java.util.Scanner;

public class UserService {
    private static final int MIN_PASSWORD_LENGTH = 4;
    private static final int MAX_PASSWORD_LENGTH = 15;
    private final UserRepository userRepository;
    Scanner scanner = new Scanner(System.in);
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private boolean validateId(String id){
        // 1. ID 내용 검증
        //  - 영어 대소문자, 숫자만 입력 가능
        //  - 공백일 경우 입력 불가
        if(!id.matches("^[a-zA-Z0-9]*$") || id.trim().isEmpty()){
            return false;
        }
        return true;
    }

    private boolean duplicateId(String id){
        List<User> userIdList =
                userRepository.selectAllUser()
                        .stream()
                        .filter(v -> v.getId().equals(id))
                        .toList();

        return userIdList.isEmpty();
    }

    private boolean verifyPassword(String password, String validatePassword) throws Exception{
        if(!password.equals(validatePassword)){
            return false;
        }
        return true;

    }
    private boolean validatePasswordLength(String password){
        if(password.trim().length() < MIN_PASSWORD_LENGTH || password.trim().length() > MAX_PASSWORD_LENGTH){
            return false;
        }
        return true;
    }

    private List<User> findAllUsers(){
        return userRepository.selectAllUser();
    }

    public void registerUser(){
        try{
            int no = findAllUsers().size() + 1;
            String id;
            String password;
            String validatePassword;

            System.out.println("\n==== 회원 가입 ====");
            System.out.print("아이디 입력 : ");
            id = scanner.nextLine();
            System.out.print("비밀번호 입력 : ");
            password = scanner.nextLine();
            System.out.print("비밀번호 확인 : ");
            validatePassword = scanner.nextLine();

            if(!validateId(id)){
                throw new IllegalArgumentException("회원가입 실패 : ID는 영어 대소문자, 숫자만 입력 가능합니다.");
            }

            if(!duplicateId(id)){
                throw new IllegalArgumentException("회원가입 실패 : 중복된 ID 입니다.");
            }

            if(!validatePasswordLength(password)){
                throw new IllegalArgumentException("회원가입 실패 : 비밀번호는 4 ~ 15 글자로 이뤄져야 합니다.");

            }

            if(!verifyPassword(password, validatePassword)){
                throw new IllegalArgumentException("회원가입 실패 : 비밀번호가 일치하지 않습니다.");
            }

            User user = new User(no, id, password);

            userRepository.insertUser(user);
        }catch(Exception e){
            System.out.println("회원가입 에러 : " + e.getMessage());
        }
    }

    public User loginUser(){
        String id;
        String password;
        try{

            System.out.println("\n==== 로그인 ====");
            System.out.print("아이디 입력 : ");
            id = scanner.nextLine();
            System.out.print("비밀번호 입력 : ");
            password = scanner.nextLine();

            return userRepository.selectUser(id, password);
        }catch(Exception e){
            throw new IllegalArgumentException("로그인 에러 : " + e.getMessage());
        }
    }

    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }
}
