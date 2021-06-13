package com.raul051;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public  void testRepeat1(){

        Assert.assertEquals(StringUtil.repeat("hola",1),"hola","hola");
    }

    @Test
    public  void testRepeat3(){

        Assert.assertEquals(StringUtil.repeat("hola",3), "holaholahola","holahola");
    }

    @Test
    public void testRepat0(){
        Assert.assertEquals(StringUtil.repeat("hola",0),"","");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepatNegativo(){
        StringUtil.repeat("hola",-1);
    }

}