package com.crudapp1.dao;
import com.crudapp1.model.User;
import java.util.List;

public interface UserDao {
    void create(User user);
    User read(int id);
    void update(User user);
    void delete(int id);
    List<User> readAll();
}
