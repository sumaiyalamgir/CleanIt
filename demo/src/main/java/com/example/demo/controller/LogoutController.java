package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LogoutController {
    @GetMapping("/logout")
    public String logout(){
        return "home";
    }
}
