package ru.neoflex.Spring_Boot_CRUD_App.dao;


import ru.neoflex.Spring_Boot_CRUD_App.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
}
