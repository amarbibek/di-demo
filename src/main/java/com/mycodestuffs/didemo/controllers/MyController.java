package com.mycodestuffs.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String greet(){
        System.out.println("Hello");
        return "Hello";
    }
}
