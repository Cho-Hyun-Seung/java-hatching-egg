package com.toki.hatchsimulator.domain;

public class Chicken extends ChickenFamily {

    public Chicken() {
        super(ChickenFamilyEnum.Chicken.getName(),
                ChickenFamilyEnum.Chicken.getEmoji(),
                15,
                1
        );
    }

    @Override
    public boolean isEgg() {
        return false;
    }

    @Override
    public boolean isChick() {
        return false;
    }

    @Override
    public boolean isChicken() {
        return true;
    }
}
