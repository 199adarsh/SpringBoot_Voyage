package org.alien.restapi.service;

import org.alien.restapi.model.UserModel;
import org.alien.restapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> getUsers(){
        return this.userRepository.getUsers();
    }


    public UserModel getUser(int id) {
        return userRepository.getUser(id);
    }

    public UserModel updateUser(UserModel userModel, int id) {
        return userRepository.updateUser(userModel, id);
    }

    public UserModel addUser(UserModel userModel) {

        return this.userRepository.addUser(userModel);

    }

    public boolean deleteUser(int id) {
        return this.userRepository.deleteUser(id);
    }
}
