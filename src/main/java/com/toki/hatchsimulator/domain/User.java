package com.toki.hatchsimulator.domain;

import java.io.Serializable;

public class User implements Serializable {
    private final int no;
    private final String id;
    private final String password;
    private int money = 30;

    public User(int no, String id, String password) {
        this.no = no;
        this.id = id;
        this.password = password;
    }

    public int getNo() {
        return no;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
