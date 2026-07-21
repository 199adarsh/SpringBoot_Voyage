package org.alien.restapi.repository;

import org.alien.restapi.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Repository
public class UserRepository {
    List<UserModel> users = new ArrayList<>();

    public UserRepository() {
        users.add(new UserModel(1, "adarsh", "adarsh@gmail.com"));
        users.add(new UserModel(2, "aniket", "aniket@gmail.com"));
        users.add(new UserModel(3, "aryan", "aryan@gmail.com"));
        System.out.println(users);
    }

    public List<UserModel> getUsers() {
        return users;
    }


    public UserModel getUser(int id) {
        return users.stream()
                .filter(user -> Objects.equals(user.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public UserModel updateUser(UserModel userModel, int id) {
        boolean exist = false;
        for(UserModel u : users){
            if(u.getId() == id){
                u.setName(userModel.getName());
                u.setEmail(userModel.getEmail());
                exist = true;
            }
        }
        if(exist)return userModel;
        return null;
    }

    public UserModel addUser(UserModel userModel) {
        users.add(userModel);
        return userModel;
    }

    public boolean deleteUser(int id) {

        for(UserModel u : users){
            if(Objects.equals(u.getId(), id)){
                users.remove(u);
                boolean success = true;

                return true;
            }
        }


        return false;
    }
}
