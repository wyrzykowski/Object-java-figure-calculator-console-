package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldntAcceptNegativeAorBvalue() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Square(-2,-3)
        );
        assertEquals("Side a and b must be >= 0", exception.getMessage());
    }

    @Test
    void calculateArea() {
                Square square = new Square(2.22,4.44);
                assertEquals(9.8586,square.calculateArea(),0.01);
    }

    @Test
    void calculatePerimeter() {
        Square square = new Square(2.22,4.44);
        assertEquals(13.32,square.calculatePerimeter(),0.01);
    }
}