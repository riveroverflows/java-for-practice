package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(6, 3);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(6, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 3);
        assertThat(result).isEqualTo(18);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
    }
}