package com.toki.hatchsimulator.domain;

public enum ChickenFamilyEnum {
    EGG("알", "\uD83E\uDD5A"),
    Chick("병아리", "\uD83D\uDC25"),
    Chicken("닭", "\uD83D\uDC14");

    private final String name;
    private final String emoji;


    ChickenFamilyEnum(String name, String emoji) {
        this.name = name;
        this.emoji = emoji;
    }

    public String getName() {
        return name;
    }

    public String getEmoji() {return emoji;}
}
