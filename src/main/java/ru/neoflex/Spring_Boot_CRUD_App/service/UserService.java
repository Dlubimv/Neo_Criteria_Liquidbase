package ru.neoflex.Spring_Boot_CRUD_App.service;


import ru.neoflex.Spring_Boot_CRUD_App.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

}
