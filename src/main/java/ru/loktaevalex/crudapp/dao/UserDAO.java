package ru.loktaevalex.crudapp.dao;

import ru.loktaevalex.crudapp.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
}
