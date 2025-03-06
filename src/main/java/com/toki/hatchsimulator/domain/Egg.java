package com.toki.hatchsimulator.domain;

public class Egg extends ChickenFamily {

    public Egg() {
        super(ChickenFamilyEnum.EGG.getName(),
                ChickenFamilyEnum.EGG.getEmoji(),
                3,
                1
        );
    }

    @Override
    public boolean isEgg() {
        return true;
    }

    @Override
    public boolean isChick() {
        return false;
    }

    @Override
    public boolean isChicken() {
        return false;
    }
}
