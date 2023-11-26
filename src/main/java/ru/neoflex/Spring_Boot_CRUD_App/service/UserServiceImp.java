package ru.neoflex.Spring_Boot_CRUD_App.service;

import ru.neoflex.Spring_Boot_CRUD_App.dao.UserDao;
import ru.neoflex.Spring_Boot_CRUD_App.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
