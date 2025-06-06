package com.kau.network.courseregister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.kau.network.courseregister.repository.UserRepository;
import com.kau.network.courseregister.model.User;

@Controller
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String id,@RequestParam String pw, Model model) {
        User user = repository.findById(id);

        if (user != null && user.getPw().equals(pw)) {
            model.addAttribute("message", "로그인 성공!");
            return "sugang";
        }

        else {
            model.addAttribute("message", "로그인 실패!");
            return "login";
        }
    }
}
