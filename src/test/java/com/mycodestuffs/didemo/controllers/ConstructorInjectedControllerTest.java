package com.mycodestuffs.didemo.controllers;

import com.mycodestuffs.didemo.services.GreetingService;
import com.mycodestuffs.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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