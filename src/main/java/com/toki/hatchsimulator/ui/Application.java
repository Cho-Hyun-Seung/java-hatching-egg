package com.toki.hatchsimulator.ui;

import com.toki.hatchsimulator.controller.ChickenCoopController;
import com.toki.hatchsimulator.controller.UserController;
import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.persistence.ChickenCoopRepository;
import com.toki.hatchsimulator.persistence.FileUserStorage;
import com.toki.hatchsimulator.persistence.UserRepository;
import com.toki.hatchsimulator.service.ChickenCoopService;
import com.toki.hatchsimulator.service.UserService;

import java.util.Scanner;

public class Application {
    private final UserController userController;
    private final ChickenCoopController chickenCoopController;
    private final Scanner scanner;
    private static User user;
    private static ChickenCoop chickenCoop;

    public Application() {
        this.userController = new UserController(new UserService(new UserRepository(new FileUserStorage())));
        this.chickenCoopController = new ChickenCoopController(new ChickenCoopService(new ChickenCoopRepository()));
        this.scanner = new Scanner(System.in);
    }

    // 회원 가입
    private void registerUser() {
        userController.registerUser();
    }

    // 로그인
    private void loginUser() {
        user = userController.loginUser();
    }

    private void nextDay() {
        chickenCoopController.nextDay(chickenCoop);
    }

    private void playGame() {
        while(true) {
            System.out.println("===== 닭장 : " + chickenCoop.getDay() + "일차 ======");
            System.out.print("상태\t:\t");
            for (ChickenFamily cf : chickenCoop.getChickenFamily()) {
                System.out.print(cf.getName() + "\t");
            }
            System.out.println();
            System.out.print("경과\t:\t");
            for (ChickenFamily cf : chickenCoop.getChickenFamily()) {
                System.out.print(cf.getLived() + "\t");
            }
            System.out.println();
            System.out.print("가격\t:\t");
            for (ChickenFamily cf : chickenCoop.getChickenFamily()) {
                System.out.print(cf.getPrice() + "\t");
            }
            System.out.println();
            System.out.println("===== 행동 =====");
            System.out.println("1. 다음 날로");
            System.out.println("2. 판매");
            System.out.println("3. 종료");
            System.out.print("=> ");
            try {
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        nextDay();
                        break;
                    case 2:
                        // 판매 메뉴로 이동
                        break;
                    case 3:
                        // 종료
                        System.out.println("종료 합니다.");
                        chickenCoop = null;
                        return;
                    default:
                        System.out.println("잘못된 값이 입력되었습니다! 다시 선택해 주세요");
                }
            } catch (Exception e) {
                System.out.println("오류 : " + e.getMessage());
//                e.printStackTrace();
            }

        }
    }

    private void startGame() {
        // 1. 닭장 생성
        chickenCoop = chickenCoopController.createChickenCoop(chickenCoop);
        System.out.println("\n닭장이 생성되었습니다!");
        playGame();

    }

    private void deleteUser(User user) {
        userController.deleteUser(user);
    }

    private void gameSetPage() {

        while (true) {
            System.out.println("\n==== Simply Hatching Simulator ====");
            System.out.println("로그인 유저 : " + user.getId());
            System.out.println("1. 게임 시작");
            System.out.println("2. 회원 탈퇴");
            System.out.println("3. 로그아웃");
            System.out.print("=> ");
            try {
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        // 로그인 화면으로 이동
                        startGame();
                        if (user != null) {
                            gameSetPage();
                        }
                        break;
                    case 2:
                        // 회원 가입 화면으로 이동
                        deleteUser(user);
                        break;
                    case 3:
                        // 로그아웃
                        System.out.println("로그아웃 합니다.");
                        user = null;
                        return;
                    default:
                        System.out.println("잘못된 값이 입력되었습니다! 다시 선택해 주세요");
                }
            } catch (Exception e) {
                System.out.println("오류 : " + e.getMessage());
            }
        }
    }


    public void run() {
        while (true) {
            System.out.println("\n==== Simply Hatching Simulator ====");
//            System.out.println("1. 게임 시작");
            System.out.println("1. 로그인");
            System.out.println("2. 회원 가입");
            System.out.println("0. 종료");
            System.out.print("=> ");
            try {
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        // 로그인 화면으로 이동
                        loginUser();
                        if (user != null) {
                            gameSetPage();
                        }
                        break;
                    case 2:
                        // 회원 가입 화면으로 이동
                        registerUser();
                        break;
                    case 0:
                        // 종료
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 값이 입력되었습니다! 다시 선택해 주세요");
                }
            } catch (Exception e) {
                System.out.println("오류 : " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Application().run();
    }
}
