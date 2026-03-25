package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/auth";
    }

    @GetMapping("/auth")
    public String authPage() {
        return "auth/auth";
    }
}