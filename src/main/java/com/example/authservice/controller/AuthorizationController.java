package com.example.authservice.controller;

import com.example.authservice.model.Authorities;
import com.example.authservice.model.User;
import com.example.authservice.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {

    private final AuthorizationService service;

    @Autowired
    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @PostMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestBody User user) {
        return service.getAuthorities(user.getUserName(), user.getPassword());
    }
}
