package com.raul051;

public class StringUtil {

    public static String repeat(String str, int times){

        if (times < 0) {
            throw new IllegalArgumentException("Hola amigo, no insertes valores negarivos :)");
        }

        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
