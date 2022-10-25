package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(6, 3);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(6, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(6, 3);
        assertThat(result).isEqualTo(18);
    }

    @Test
    void divide() {
        int result = calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
    }
}