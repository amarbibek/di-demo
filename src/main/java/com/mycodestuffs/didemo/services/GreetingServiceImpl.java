package com.mycodestuffs.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String GREETING_MESSAGE ="Hello";
    @Override
    public String sayGreeting() {
        return GREETING_MESSAGE;
    }
}
