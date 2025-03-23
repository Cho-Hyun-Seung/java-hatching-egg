package com.toki.hatchsimulator.exception.error;

public enum InputErrorCode implements Error{

    INPUT_REQUIRE_NUM("INPUT_REQUIRE_INT", "INPUT-01", "정수 형태로 입력해 주세요."),
    INPUT_NUM_UNDERFLOW("INPUT_NUM_UNDERFLOW", "INPUT-02", "입력 값이 범위를 넘어섰습니다."),
    INPUT_NUM_OVERFLOW("INPUT_NUM_OVERFLOW", "INPUT-03", "엽력 값이 범위보다 낮습니다.");

    InputErrorCode(String name, String code, String message) {
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
