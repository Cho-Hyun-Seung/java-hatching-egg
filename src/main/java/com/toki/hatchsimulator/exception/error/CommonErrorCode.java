package com.toki.hatchsimulator.exception.error;

public enum CommonErrorCode implements Error{

    BLANK_INPUT_ERROR("BLANK_INPUT_ERROR", "COMM-01", "공백 입력은 할 수 없습니다.");

    CommonErrorCode(String name, String code, String message) {
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
