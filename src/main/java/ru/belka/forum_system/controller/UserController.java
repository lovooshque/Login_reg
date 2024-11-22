package ru.belka.forum_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.belka.forum_system.entity.User;
import ru.belka.forum_system.repository.UserRepository;
import ru.belka.forum_system.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {
    @Autowired
    UserRepository userRepo;
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> alluser(@RequestBody User newUser){
        return userService.allUsers();
    }

    @PostMapping("")
    public User registerUser(@RequestBody User newUser){
        userService.saveUser(newUser);

        return newUser;
    }
}
