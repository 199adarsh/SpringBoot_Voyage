package org.alien.restapi.controller;


import org.alien.restapi.model.UserModel;
import org.alien.restapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserModel> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("{id}")
    public UserModel getUser(@PathVariable int id) {

        return this.userService.getUser(id);
    }

    @PutMapping("{id}")
    public UserModel updateUser(@RequestBody UserModel userModel, @PathVariable int id) {
        System.out.println(userModel);
        return this.userService.updateUser(userModel, id);
    }

    @PostMapping
    public UserModel addUser(@RequestBody UserModel userModel){

        return this.userService.addUser(userModel);
    }

    @DeleteMapping({"/{id}"})
    public boolean deleteUser(@PathVariable int id){
        return this.userService.deleteUser(id);
    }


}
