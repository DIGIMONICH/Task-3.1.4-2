package com.preproject.dao;


import com.preproject.model.User;

import java.util.List;

public interface UserDao {

   List<User> getAllUsers();

   void createUser(User user);

   void updateUser(User user);

   User readUser(long id);

   User deleteUser(long id);
}