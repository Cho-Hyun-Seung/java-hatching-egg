package com.toki.hatchsimulator.domain;

public class Chick extends ChickenFamily {
    public Chick() {
        super(ChickenFamilyEnum.Chick.getName(),
                ChickenFamilyEnum.Chick.getEmoji(),
                9,
                1
        );
    }

    @Override
    public boolean isEgg() {
        return false;
    }

    @Override
    public boolean isChick() {
        return true;
    }

    @Override
    public boolean isChicken() {
        return false;
    }
}
