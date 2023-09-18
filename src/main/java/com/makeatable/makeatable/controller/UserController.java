package com.makeatable.makeatable.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makeatable.makeatable.model.User;
import com.makeatable.makeatable.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    
    @PostMapping
    public String newUser(@RequestBody User user){
        userService.addUser(user);
        return "success";
    }
    
}
