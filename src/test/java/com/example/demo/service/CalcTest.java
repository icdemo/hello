package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {
    private final Calc calc = new Calc();

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, calc.add(2,3));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(2, calc.subtract(5,3));
    }
}
