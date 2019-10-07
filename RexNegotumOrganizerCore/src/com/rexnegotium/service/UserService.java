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

    // todo - throws RNException here
    public User get(Integer userId) throws Exception {
        return userRepository.get(userId);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User create(User user) {
        return userRepository.create(user);
    }
}
