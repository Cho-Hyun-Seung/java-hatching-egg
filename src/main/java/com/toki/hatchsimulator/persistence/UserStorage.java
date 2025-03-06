package com.toki.hatchsimulator.persistence;

import com.toki.hatchsimulator.domain.User;

import java.util.List;

public interface UserStorage {
    void saveUsers(List<User> userList);

    List<User> loadUsers();
}
