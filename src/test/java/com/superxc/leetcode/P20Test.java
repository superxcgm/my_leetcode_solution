package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P20Test {

    private P20 p20;

    @Before
    public void setUp() throws Exception {
        p20 = new P20();
    }

    @Test
    public void isValidTest1() {
        Assert.assertTrue(p20.isValid("()"));
    }
    @Test
    public void isValidTest2() {
        Assert.assertTrue(p20.isValid("()[]{}"));
    }
    @Test
    public void isValidTest3() {
        Assert.assertFalse(p20.isValid("(]"));
    }
    @Test
    public void isValidTest4() {
        Assert.assertFalse(p20.isValid("([)]"));
    }
    @Test
    public void isValidTest5() {
        Assert.assertTrue(p20.isValid("{[]}"));
    }

}