package com.mycodestuffs.didemo.controllers;

import com.mycodestuffs.didemo.services.GreetingService;
import com.mycodestuffs.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
//    String sayHello(){
//        return getGreetingService().sayGreeting();
//    }

//    public GreetingServiceImpl getGreetingService(){
//        return greetingService;
//    }
}
