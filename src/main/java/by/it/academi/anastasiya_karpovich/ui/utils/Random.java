package by.it.academi.anastasiya_karpovich.ui.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Random {
    public static String generateText() {
        return RandomStringUtils.randomAlphabetic(6, 10);
    }
}