package com.preproject.service;

import com.preproject.model.Role;
import com.preproject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public void add(Role role) {
        roleRepository.save(role);
    }

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }


    public Optional<Role> findRoleById(int id) {
        return roleRepository.findById(id);
    }
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    public Role getRoleById(int id) {
        return roleRepository.getRoleById(id);
    }

}