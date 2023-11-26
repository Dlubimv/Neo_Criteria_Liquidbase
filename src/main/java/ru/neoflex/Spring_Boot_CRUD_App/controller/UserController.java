package ru.neoflex.Spring_Boot_CRUD_App.controller;

import ru.neoflex.Spring_Boot_CRUD_App.model.User;
import ru.neoflex.Spring_Boot_CRUD_App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers(Model model) {
        return userService.getAllUsers();
    }
}
