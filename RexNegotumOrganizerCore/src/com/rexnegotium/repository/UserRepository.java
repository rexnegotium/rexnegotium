package com.rexnegotium.repository;

import com.rexnegotium.model.User;

import java.util.List;

public interface UserRepository {

    public List<User> getAll();
}
