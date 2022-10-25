package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void add() {
        Calculator calculator = new Calculator();
        System.out.println("calculator.add(6, 3) = " + calculator.add(6, 3));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        System.out.println("calculator.subtract(6, 3) = " + calculator.subtract(6, 3));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        System.out.println("calculator.multiply(6, 3) = " + calculator.multiply(6, 3));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        System.out.println("calculator.divide(6, 3) = " + calculator.divide(6, 3));
    }
}