package com.toki.hatchsimulator.exception.error;

/* Enum으로 에러코드 관리를 위해 Interface 활용하기! */
public interface Error {
    String getName();
    String getCode();
    String getMessage();
}
