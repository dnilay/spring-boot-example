package com.example.themeparkapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String sayHello()
    {
        return "hello world";
    }
}
