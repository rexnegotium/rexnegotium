package com.rexnegotium.controller;

import com.rexnegotium.model.User;
import com.rexnegotium.service.UserService;

import java.util.List;

public class UserController {

    private UserService userService;

    public UserController() {
        System.out.println("Initializint TaskController...");

        userService = new UserService();

        System.out.println("TaskController initialized!");
    }

    // todo - throws RNException here
    public User get(Integer userId) throws Exception {
        return userService.get(userId);
    }

    public List<User> getAll() {
        return userService.getAll();
    }

    public User create(User user) {
        return userService.create(user);
    }
}
