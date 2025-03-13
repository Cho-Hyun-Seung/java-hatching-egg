package com.toki.hatchsimulator.config;

import com.toki.hatchsimulator.controller.auth.AuthController;
import com.toki.hatchsimulator.repository.UserRepository;
import com.toki.hatchsimulator.repository.UserRepositoryImpl;
import com.toki.hatchsimulator.service.auth.AuthService;
import com.toki.hatchsimulator.service.auth.AuthServiceImpl;

public class AppConfig {

    public AuthController authController(){
        return new AuthController(authService());
    }

    public AuthService authService(){
        return new AuthServiceImpl(userRepository());
    }

    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }
}
