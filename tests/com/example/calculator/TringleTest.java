package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TringleTest {
    @Test
    void shouldntAcceptNegativeSideValue() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Tringle(-2,-3,-3)
        );
        assertEquals("Side a,b and c must be >= 0", exception.getMessage());
    }
    @Test
    void shouldntAcceptBadSideValues() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Tringle(1,2,3)
        );
        assertEquals("Cannot build Tringle with given sides.", exception.getMessage());
    }


    @Test
    void calculateArea() {
        Tringle tringle = new Tringle(2.2,2.3,3.5);
       assertEquals(2.4738633753705965,tringle.calculateArea(),0.0001);
    }

    @Test
    void calculatePerimeter() {
        Tringle tringle = new Tringle(2.2,2.3,3.5);
        assertEquals(8,tringle.calculatePerimeter(),0.0001);
    }
}