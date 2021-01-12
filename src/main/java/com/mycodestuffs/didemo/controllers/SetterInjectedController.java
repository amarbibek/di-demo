package com.mycodestuffs.didemo.controllers;

import services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    public GreetingService greetingService;

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
