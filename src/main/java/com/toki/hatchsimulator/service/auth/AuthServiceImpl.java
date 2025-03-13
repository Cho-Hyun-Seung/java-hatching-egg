package com.toki.hatchsimulator.service.auth;

import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.repository.UserRepository;

public class AuthServiceImpl implements AuthService {
    UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register() {
        /* 고려해야하는 사항
         * 1. 아이디 중복 체크
         * 2. 비밀번호 자리수 체크
         * 3. 공백 체크
         * */

    }

    @Override
    public User login() {
        return null;
    }

    @Override
    public void logout(User user) {

    }
}
