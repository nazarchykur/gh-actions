package com.example.ghactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
