package com.preproject.service;

import com.preproject.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User getUser(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}