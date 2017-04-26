package com.weatherchange.utils;

public class Utils {
    public static int tryParseInt(String value) {
        try {
            int tmp = Integer.parseInt(value);
            return tmp;
        } catch (NumberFormatException e) {
            return -1000;
        }
    }

    public static double tryParseDouble(String value) {
        try {
            double tmp = Double.parseDouble(value);
            return tmp;
        } catch (NumberFormatException e) {
            return -1000.0;
        }
    }
}
