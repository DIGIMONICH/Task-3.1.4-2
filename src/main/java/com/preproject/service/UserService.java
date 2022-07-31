package com.preproject.service;


import com.preproject.model.User;
import com.preproject.repository.RoleRepository;
import com.preproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    public User findById(int id) {
        return userRepository.getById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    public User getByUserName(String mail) {
        return userRepository.findByMail(mail);
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        User user = userRepository.findByMail(mail);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

}