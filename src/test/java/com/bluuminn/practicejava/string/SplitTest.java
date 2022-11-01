package com.bluuminn.practicejava.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitTest {

    @Test
    void split() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");

        values = "1,2".split(",");
        assertThat(values).contains("1", "2");
    }
}
