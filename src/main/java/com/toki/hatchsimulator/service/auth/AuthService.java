package com.toki.hatchsimulator.service.auth;

import com.toki.hatchsimulator.domain.User;

public interface AuthService {
    void register();
    User login();
    void logout(User user);
}
