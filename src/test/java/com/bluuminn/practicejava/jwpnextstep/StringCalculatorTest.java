package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void default_delimiter() {
        int result = stringCalculator.add("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void custom_delimiter() {
        int result = stringCalculator.add("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void 음수_입력_시_예외가_발생해야한다() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> stringCalculator.add("-1:3:2"));
    }

}