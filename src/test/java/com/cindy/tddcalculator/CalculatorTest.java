package com.cindy.tddcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        double result = calculator.sum(5, 4);
        Assertions.assertEquals(9, result);
    }

    @Test
    void subtractionTest() {
        double result = calculator.subtraction(5, 4);
        Assertions.assertEquals(1, result);
    }

    @Test
    void divideTest() {
        double result = calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    void multiplyTest() {
        double result = calculator.multiply(6, 2);
        Assertions.assertEquals(12, result);
    }
}