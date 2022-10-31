package com.bluuminn.practicejava.string;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest {

    @Test
    void patternCompileTest() {
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher("1D2S#10S*");

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }
}
