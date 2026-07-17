package org.adarsh.restapi.controller;


import org.adarsh.restapi.model.UserModel;
import org.adarsh.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return this.userService.getAllUsers();
    }


    @GetMapping("/{name}")
    public UserModel getUser(@PathVariable String name) {
        return userService.getUser(name);
    }
}
