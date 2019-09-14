package com.rexnegotium.service;

import com.rexnegotium.config.factories.RepositoryFactory;
import com.rexnegotium.model.User;
import com.rexnegotium.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService() {
        userRepository = RepositoryFactory.getInstanceOfUserRepository();
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User create(User user) {
        return userRepository.create(user);
    }
}
