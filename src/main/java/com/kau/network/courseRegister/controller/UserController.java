package com.kau.network.courseRegister.controller;

import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.model.User;
import com.kau.network.courseRegister.model.dto.in.LoginReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/login")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = service.getAllUser();

        return ResponseEntity.ok(users);
    }

    @PostMapping("/login")
    public ResponseEntity<MessageRes> login(@RequestBody LoginReq loginReq) {
        MessageRes message = service.login(loginReq);

        return ResponseEntity.ok(message);
    }
}
