package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("before each");
    }

    @AfterEach
    void teardown() {
        System.out.println("after each");
    }

    @AfterAll
    void teardownAll() {
        System.out.println("after all");
    }

    @Test
    void add() {
        int result = calculator.add(6, 3);
        assertThat(result).isEqualTo(9);
        System.out.println("add");
    }

    @Test
    void subtract() {
        int result = calculator.subtract(6, 3);
        assertThat(result).isEqualTo(3);
        System.out.println("subtract");
    }

    @Test
    void multiply() {
        int result = calculator.multiply(6, 3);
        assertThat(result).isEqualTo(18);
        System.out.println("multiply");
    }

    @Test
    void divide() {
        int result = calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
        System.out.println("divide");
    }
}