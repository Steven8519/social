package com.dev.social.controllers;

import com.dev.social.entities.User;
import com.dev.social.service.UserServiceImpl;
import com.dev.social.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/1.0/users")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public GenericResponse createUser(@RequestBody User user) {
        this.userService.save(user);
        return new GenericResponse("User saved");
    }
}
