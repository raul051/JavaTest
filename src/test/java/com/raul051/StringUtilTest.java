package com.raul051;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public static void testRepeat(){

        Assert.assertEquals(StringUtil.repeat("hola",3), "holaholahola");
        Assert.assertEquals(StringUtil.repeat("hola",1),"hola");
    }

}