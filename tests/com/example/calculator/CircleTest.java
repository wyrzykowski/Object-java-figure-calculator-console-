package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldntAcceptNegativeRadius() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Circle(-2)
        );
        assertEquals("Radius must be >= 0: -2.0", exception.getMessage());
    }
    @Test
    void calculateArea() {
        Circle circle = new Circle(2.22);
        assertEquals(15.47,circle.calculateArea(),0.1);
    }

    @Test
    void calculatePerimeter() {
        Circle circle = new Circle(2.22);
        assertEquals(13.94,circle.calculatePerimeter(),0.1);
    }
}