package com.toki.hatchsimulator.exception.error;

public class AuthErrorCode extends Error{
    /* TODO 로그인, 탈퇴, 회원가입 시 발생하는 에러 적어주기!*/
    public static final AuthErrorCode INVALID_CREDENTIAL = new AuthErrorCode("INVALID_CREDENTIAL", "AUTH-01", "아이디 또는 비밀번호가 잘못되었습니다.");
    public static final AuthErrorCode ID_ALREADY_EXISTS = new AuthErrorCode("ID_ALREADY_EXISTS", "AUTH-02", "이미 존재하는 ID 입니다.");
    public static final AuthErrorCode INVALID_PASSWORD = new AuthErrorCode("INVALID_PASSWORD", "AUTH-03", "비밀번호가 다릅니다.");

    private AuthErrorCode(String name, String code, String message){
        super(name, code, message);
    }

}
