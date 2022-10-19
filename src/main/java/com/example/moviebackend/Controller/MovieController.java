package com.example.moviebackend.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @PostMapping("/movieAdd")
    public String movie(){
        return "Test";
    }
}
