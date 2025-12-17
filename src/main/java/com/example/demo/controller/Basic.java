package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@RestController;
public class Basic{
    @Getmapping("/home")
    public String getter(){
        return "HelloWorld";
    }
}