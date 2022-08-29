package ru.loktaevalex.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.loktaevalex.crudapp.dao.UserDaoImpl;
import ru.loktaevalex.crudapp.model.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void getUser(int id) {
        userDao.getUser(id);
    }
}
