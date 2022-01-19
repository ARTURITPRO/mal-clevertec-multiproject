package ru.clevertec.core;


import ru.clevertec.utils.StringUtils;


public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {

        for (String a : str) {
            if (!StringUtils.isPositiveNumber(a)) return false;
        }
        return true;
    }
}
