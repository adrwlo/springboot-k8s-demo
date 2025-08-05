package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/test")
    public String sayTest() {
        return "Hello test!";
    }

    @GetMapping("/new-test")
    public String sayNewTest() {
        return "Hello new test!";
    }
}
