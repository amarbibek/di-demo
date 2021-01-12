package com.mycodestuffs.didemo.controllers;

import com.mycodestuffs.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
       this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    void testGreeting() {
        Assertions.assertEquals(GreetingServiceImpl.GREETING_MESSAGE,propertyInjectedController.sayHello());
    }
}