package com.preproject.repository;

import com.preproject.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
    User findByMail(String mail);
    User findUserById(int id);
}