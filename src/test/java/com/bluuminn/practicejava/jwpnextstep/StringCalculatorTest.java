package com.bluuminn.practicejava.jwpnextstep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class StringCalculatorTest {
    StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void 빈_문자열_또는_null_일_경우_0_반환() {
        assertThat(calculator.add(" ")).isEqualTo(0);
        assertThat(calculator.add(null)).isEqualTo(0);
    }

    @Test
    void 숫자_하나만_입력할_경우_해당_숫자_반환() {
        assertThat(calculator.add("1")).isEqualTo(1);
        assertThat(calculator.add("3")).isEqualTo(3);
    }

    @Test
    void 쉼표_구분자() {
        assertThat(calculator.add("2,3")).isEqualTo(5);
        assertThat(calculator.add("1,2")).isEqualTo(3);
    }

    @Test
    void 쉼표와_콜론_구분자() {
        assertThat(calculator.add("1,2:3")).isEqualTo(6);
    }

    @Test
    void 커스텀_구분자() {
        assertThat(calculator.add("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    void 음수_입력_시_예외_발생() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> calculator.add("-1:3:2"));
    }
}