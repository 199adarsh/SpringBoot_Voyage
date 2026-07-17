package org.adarsh.restapi.service;

import org.adarsh.restapi.model.UserModel;
import org.adarsh.restapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository users;

    //Constructor Injection
    public UserService(UserRepository users) {
        this.users = users;
    }

    public List<UserModel> getAllUsers() {
        return this.users.getAllUsers();
    }

    public UserModel getUser(String name) {
        return this.users.getUser(name);
    }


}
