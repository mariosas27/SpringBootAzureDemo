package com.example.SpringBootAzureDemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @RequestMapping("/usuario")
    public String getUsuario(){
        return "Juan Mario";
    }
}
