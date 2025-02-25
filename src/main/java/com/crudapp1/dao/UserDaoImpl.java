package com.crudapp1.dao;

import com.crudapp1.model.User;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user) {
        em.persist(user);
    }

    @Override
    public User read(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void delete(int id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    public List<User> readAll() {
        return em.createQuery("FROM User u", User.class).getResultList();
    }
}
