package com.mycodestuffs.didemo.controllers;

import services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        Assertions.assertEquals(GreetingServiceImpl.GREETING_MESSAGE,constructorInjectedController.sayHello());
    }
}