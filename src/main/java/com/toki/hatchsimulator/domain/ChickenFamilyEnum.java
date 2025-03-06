package com.toki.hatchsimulator.domain;

public enum ChickenFamilyEnum {
    EGG("알"),
    Chick("병아리"),
    Chicken("닭");

    private final String name;


    ChickenFamilyEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
