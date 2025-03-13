package com.toki.hatchsimulator.controller.auth;

import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.service.auth.AuthService;

public class AuthController {

    AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    public void register(){
        authService.register();
    }

    public User login(){
        authService.login();
        return null;
    }

    public void logout(User user){
        authService.logout(user);
    }

}
