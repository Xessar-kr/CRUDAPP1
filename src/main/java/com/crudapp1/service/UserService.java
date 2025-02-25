package com.crudapp1.service;

import com.crudapp1.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    User read(int id);
    void update(User user);
    void delete(int id);
    List<User> readAll();
}
