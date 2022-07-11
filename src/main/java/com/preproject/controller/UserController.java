package com.preproject.controller;

import com.preproject.service.RoleService;
import com.preproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/users")
    public String index(Model model, Principal principal) {
        model.addAttribute("user", userService.getByUserName(principal.getName()));
        model.addAttribute("roles", roleService.getAllRole());
        return "/user/index";
    }

}