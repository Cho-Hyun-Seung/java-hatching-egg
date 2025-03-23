package com.toki.hatchsimulator.exception.error;

public enum AuthErrorCode implements Error{
    /* TODO 로그인, 탈퇴, 회원가입 시 발생하는 에러 적어주기!*/

    INVALID_CREDENTIAL ("INVALID_CREDENTIAL", "AUTH-01", "아이디 또는 비밀번호가 잘못되었습니다."),
    ID_ALREADY_EXISTS ("ID_ALREADY_EXISTS", "AUTH-02", "이미 존재하는 ID 입니다."),
    INVALID_PASSWORD ("INVALID_PASSWORD", "AUTH-03", "비밀번호가 다릅니다.");

    AuthErrorCode(String name, String code, String message) {
        this.name = name;
        this.code = code;
        this.message = message;
    }

    private final String name;
    private final String code;
    private final String message;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
