package com.appsdeveloperblog.photoapp.api.users.ui.controllers;

import com.appsdeveloperblog.photoapp.api.users.ui.model.CreateUserRequestModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port" + environment.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@RequestBody @Valid CreateUserRequestModel userDetails) {
        return "Create user method is called";
    }
}
