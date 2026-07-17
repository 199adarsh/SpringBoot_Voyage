package org.adarsh.restapi.repository;

import org.adarsh.restapi.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {

    List<UserModel> users = new ArrayList<>();

    public UserRepository() {
        users.add(new UserModel("Adarsh", "adarsh@gmail.com", "Adarsh21"));
        users.add(new UserModel("Alex", "alex@gmail.com", "Alex11"));
        users.add(new UserModel("Jonny", "jonny@gmail.com", "Jonathan16"));
        users.add(new UserModel("Spero", "sperocasts@gmail.com", "spero19"));

    }

    public List<UserModel> getAllUsers() {
        return users;
    }

    public UserModel getUser(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

}
