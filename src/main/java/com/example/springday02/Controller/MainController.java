package com.example.springday02.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // we use because it returns JSON file
public class MainController {

    String data;
@GetMapping("/message") // small letter // this is a endpoint with a get method with path port/message and returns json.
    public String getMessage(){
        return "Hey from spring";
    }
}
