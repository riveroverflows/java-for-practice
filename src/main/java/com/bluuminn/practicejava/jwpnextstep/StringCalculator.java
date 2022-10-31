package com.bluuminn.practicejava.jwpnextstep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }
        Matcher matcher = Pattern.compile("//(.)\\n(.*)").matcher(text);
        String[] characters;
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            characters = matcher.group(2).split(customDelimiter);
        } else {
            characters = text.split("[,:]");
        }
        int sum = 0;
        for (String character : characters) {
            int number = Integer.parseInt(character);
            if (number < 0) {
                throw new RuntimeException();
            }
            sum += number;
        }
        return sum;
    }
}
