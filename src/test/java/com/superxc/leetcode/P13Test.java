package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P13Test {

    private P13 p13;

    @Before
    public void setUp() throws Exception {
        p13 = new P13();
    }

    @Test
    public void romanToIntTest1() {
        Assert.assertEquals(3, p13.romanToInt("III"));
    }

    @Test
    public void romanToIntTest2() {
        Assert.assertEquals(4, p13.romanToInt("IV"));
    }

    @Test
    public void romanToIntTest3() {
        Assert.assertEquals(9, p13.romanToInt("IX"));
    }

    @Test
    public void romanToIntTest4() {
        Assert.assertEquals(58, p13.romanToInt("LVIII"));
    }

    @Test
    public void romanToIntTest5() {
        Assert.assertEquals(1994, p13.romanToInt("MCMXCIV"));
    }

}