package com.toki.hatchsimulator.domain;

public class User {
    private String id;
    private String password;

    // 유저에 Setter가 있을 이유가 없음
    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
