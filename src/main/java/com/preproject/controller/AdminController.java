package com.preproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public String getAllUser(){
        return "admin/users";
    }
}