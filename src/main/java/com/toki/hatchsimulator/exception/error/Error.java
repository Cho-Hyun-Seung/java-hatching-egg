package com.toki.hatchsimulator.exception.error;

public abstract class Error {
    private final String name;
    private final String code;
    private final String message;

    protected Error(String name, String code, String message) {
        this.name = name;
        this.code = code;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
