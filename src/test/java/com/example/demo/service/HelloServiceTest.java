package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @org.junit.jupiter.api.Test
    void getHello() {
        HelloService helloService = new HelloService();
        String result = helloService.getHello("John");
        assertEquals("Hello, World! John", result);
    }

    @org.junit.jupiter.api.Test
    void getHelloNull() {
        HelloService helloService = new HelloService();
        String result = helloService.getHello(null);
        assertEquals("Hello, World! null", result);
    }

}