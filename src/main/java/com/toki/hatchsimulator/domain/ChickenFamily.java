package com.toki.hatchsimulator.domain;

public abstract class ChickenFamily {
    private final String name;
    private int price;
    private int lived;

    public ChickenFamily(String name, int price, int lived) {
        this.name = name;
        this.price = price;
        this.lived = lived;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLived() {
        return lived;
    }

    public void setLived(int lived) {
        this.lived = lived;
    }

    public abstract boolean isEgg();
    public abstract boolean isChick();
    public abstract boolean isChicken();

}
