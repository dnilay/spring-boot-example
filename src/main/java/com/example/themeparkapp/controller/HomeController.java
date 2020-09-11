package com.example.themeparkapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String sayHello()
    {
        return "hello world docker";
    }
}
