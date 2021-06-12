package com.raul051;

public class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("hola",3), "holaholahola");

        if(!StringUtil.repeat("hola",3).equals("holaholahola")){
            throw new RuntimeException("ERROR");
        }else {
            System.out.println("Todo Bien");
        }

        String result2 = StringUtil.repeat("hola",1);
        if(!result2.equals("hola")){
            throw new RuntimeException("ERROR");
        }else
            System.out.println("Todo Bien");
    }

    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException( actual + "No es igual al valor esperado");
        }
    }
}