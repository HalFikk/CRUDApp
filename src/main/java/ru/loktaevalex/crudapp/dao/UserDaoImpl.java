package ru.loktaevalex.crudapp.dao;

import org.springframework.stereotype.Repository;
import ru.loktaevalex.crudapp.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.getEntityManagerFactory().createEntityManager().contains(user);
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void getUser(int id) {

    }
}
