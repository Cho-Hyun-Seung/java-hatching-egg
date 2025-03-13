package com.toki.hatchsimulator.view;

import java.util.Scanner;

/* 사용자의 입력을 요청하는 View */
public class InputView {
    private final static Scanner scanner = new Scanner(System.in);

    public static String getUserId(){
        System.out.print("아이디를 입력해 주세요 : ");
        return getUserInput();
    }

    // 비밀번호 확인 시 재사용!
    public static String getUserPassword(){
        System.out.print("비밀번호를 입력해주세요 : ");
        return getUserInput();
    }

    public static String getUserInput(){
        return scanner.nextLine();
    }
}
