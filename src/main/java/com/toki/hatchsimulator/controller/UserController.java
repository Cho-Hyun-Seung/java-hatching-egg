package com.toki.hatchsimulator.controller;

import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser() {
        userService.registerUser();
    }

    public User loginUser() {
        return userService.loginUser();
    }

    public void deleteUser(User user) {
        userService.deleteUser(user);
    }
}
