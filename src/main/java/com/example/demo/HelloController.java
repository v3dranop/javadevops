package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/welcome")
    public String hello() {
        return "Greetings from Spring Boot!";
    }  

}