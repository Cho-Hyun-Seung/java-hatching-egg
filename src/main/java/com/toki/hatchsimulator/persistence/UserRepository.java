package com.toki.hatchsimulator.persistence;

import com.toki.hatchsimulator.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> userList;
    private final UserStorage userStorage;

    public UserRepository(UserStorage userStorage) {
        this.userStorage = userStorage;
        this.userList = userStorage.loadUsers();
    }

    public List<User> selectAllUser() {
        return new ArrayList<User>(userList);
    }

    public void insertUser(User user){
        userList.add(user);
        userStorage.saveUsers(userList);
    }

    public void deleteUser(User user){
        userList.remove(user);
        userStorage.saveUsers(userList);
    }

    public User selectUser(String id, String password) {
        User user = userList.stream()
                .filter(v -> v.getId().equals(id) && v.getPassword().equals(password))
                .findFirst()
                .orElse(null);
        if(user == null){
            throw new IllegalArgumentException("로그인 에러 : 아이디 또는 비밀번호가 잘못 되었습니다.");
        }
        return user;
    }

//    public User getUser(){
//        User user
//        return user;
//    }
}
