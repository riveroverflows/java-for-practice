package com.bluuminn.practicejava.jwpnextstep;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInt(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    private String[] split(String text) {
        Matcher matcher = Pattern.compile("//(.)\\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }
        return text.split("[,:]");
    }

    private int[] toInt(String[] values) {
        return Arrays.stream(values)
                .mapToInt(this::toPositive)
                .toArray();
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    private int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
