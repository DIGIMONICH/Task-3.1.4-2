package com.preproject.service;

import com.preproject.models.Role;

import java.util.Set;

public interface RoleService {
    Role getOrCreateRole(String name);

    Set<Role> getRoles();
}
