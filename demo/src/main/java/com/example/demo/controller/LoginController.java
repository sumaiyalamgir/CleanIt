package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // Assuming your HTML file is named "login.html"
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return "user-home";
    }
}
