package com.crudapp1.service;

import com.crudapp1.dao.UserDao;
import com.crudapp1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public User read(int id) {
        return userDao.read(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public List<User> readAll() {
        return userDao.readAll();
    }
}
