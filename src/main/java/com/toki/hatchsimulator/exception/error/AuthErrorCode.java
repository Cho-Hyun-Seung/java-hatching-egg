package com.toki.hatchsimulator.exception.error;

public class AuthErrorCode extends Error{
    /* TODO 로그인, 탈퇴, 회원가입 시 발생하는 에러 적어주기!*/

    private AuthErrorCode(String name, String code, String message){
        super(name, code, message);
    }
}
