package com.mycodestuffs.didemo.controllers;

import services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String greet(){
//        System.out.println("Hello");
        return greetingService.sayGreeting();
    }
}
