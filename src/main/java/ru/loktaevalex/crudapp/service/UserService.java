package ru.loktaevalex.crudapp.service;

import ru.loktaevalex.crudapp.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
}
