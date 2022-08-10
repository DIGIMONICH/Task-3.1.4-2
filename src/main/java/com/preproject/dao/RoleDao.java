package com.preproject.dao;

import com.preproject.models.Role;

import java.util.Set;

public interface RoleDao {
    Role getOrCreateRole(String name);

    Set<Role> getRoles();

}
