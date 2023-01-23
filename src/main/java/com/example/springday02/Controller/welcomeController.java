package com.example.springday02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String getName(){
        return "My Name is Shahad";
    }

    @GetMapping("/age")
    public String getAge(){
        return "My age is 22";
    }

    @GetMapping("/check/status")
    public String getStatus(){
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String getHealth(){
        return "Server health is up and running";
    }
}
