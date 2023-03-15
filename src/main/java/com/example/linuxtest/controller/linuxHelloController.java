package com.example.linuxtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class linuxHelloController {

    @GetMapping("/hello")
    public String linuxHello(){
        return "hello linux";
    }
}
