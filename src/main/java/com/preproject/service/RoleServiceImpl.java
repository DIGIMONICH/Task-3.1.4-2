package com.preproject.service;


import com.preproject.dao.RoleDao;
import com.preproject.models.Role;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public Role getOrCreateRole(String name) {
        return roleDao.getOrCreateRole(name);
    }

    @Override
    public Set<Role> getRoles() {
        return roleDao.getRoles();
    }
}
