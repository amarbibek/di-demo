package com.mycodestuffs.didemo.controllers;

import com.mycodestuffs.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        Assertions.assertEquals(GreetingServiceImpl.GREETING_MESSAGE,setterInjectedController.sayHello());
    }
}