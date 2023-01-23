package com.example.springday02;

import com.example.springday02.Controller.MainController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDay02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDay02Application.class, args);
    }

}
