package com.toki.hatchsimulator.repository;

import com.toki.hatchsimulator.domain.User;

public interface UserRepository {
    public User getUser();
    public void deleteUser(User user);
    public void addUser(User user);

}
