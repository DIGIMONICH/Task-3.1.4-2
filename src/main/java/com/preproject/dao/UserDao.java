package com.preproject.dao;

import com.preproject.models.User;

import java.util.List;

public interface UserDao {
    User findByUsername(String username);

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    User saveUser(User user, String[] roles);

    void updateUser(User updatedUser);

    void updateUser(User updatedUser, String[] roles);

    void delete(int id);

}
