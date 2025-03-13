package com.toki.hatchsimulator.view;

import com.toki.hatchsimulator.domain.User;

public class OutputView {

    public static void printMain(){
        System.out.println("\n==== Simply Hatching Simulator ====");
//            System.out.println("1. 게임 시작");
        System.out.println("1. 로그인");
        System.out.println("2. 회원 가입");
        System.out.println("0. 종료");
        System.out.print("=> ");
    }

    public static void printReadyGame(final User user){
        System.out.println("\n==== Simply Hatching Simulator ====");
        System.out.println("로그인 유저 : " + user.getId());
        System.out.println("1. 게임 시작");
        System.out.println("2. 회원 탈퇴");
        System.out.println("0. 로그아웃");
        System.out.print("=> ");
    }

    public static void printGame(){

    }
}
