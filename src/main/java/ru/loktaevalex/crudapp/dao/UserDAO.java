package ru.loktaevalex.crudapp.dao;

import ru.loktaevalex.crudapp.model.User;

public interface UserDAO {
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public void getUser(int id);
}
