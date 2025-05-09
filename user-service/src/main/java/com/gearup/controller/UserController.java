package com.gearup.controller;

import com.gearup.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        user.setEmail("sam@gmail.com");
        user.setFullName("Sam Collin");
        user.setPhone("+94761234456");
        user.setRole("Customer");
        return  user;
    }
}
