package com.dev.social.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/1.0/users")
public class UserController {
    @PostMapping
    public void createUser() {

    }
}
