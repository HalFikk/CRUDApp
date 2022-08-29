package ru.loktaevalex.crudapp.service;

import ru.loktaevalex.crudapp.model.User;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public void getUser(int id);
}
