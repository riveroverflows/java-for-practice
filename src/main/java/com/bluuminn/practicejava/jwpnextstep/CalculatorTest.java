package com.bluuminn.practicejava.jwpnextstep;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("calculator.add(3, 4) = " + calculator.add(3, 4));
        System.out.println("calculator.subtract(5, 4) = " + calculator.subtract(5, 4));
        System.out.println("calculator.multiply(2, 6) = " + calculator.multiply(2, 6));
        System.out.println("calculator.divide(8, 4) = " + calculator.divide(8, 4));
    }
}
