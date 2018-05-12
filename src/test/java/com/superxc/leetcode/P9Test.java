package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P9Test {

    private P9 p9;

    @Before
    public void setUp() throws Exception {
        p9 = new P9();
    }

    @Test
    public void isPalindromeTest1() {
        Assert.assertTrue(p9.isPalindrome(121));
    }

    @Test
    public void isPalindromeTest2() {
        Assert.assertFalse(p9.isPalindrome(-121));
    }

    @Test
    public void isPalindromeTest3() {
        Assert.assertFalse(p9.isPalindrome(10));
    }

    @Test
    public void isPalindrome1Test1() {
        Assert.assertTrue(p9.isPalindrome1(121));
    }

    @Test
    public void isPalindrome2Test2() {
        Assert.assertFalse(p9.isPalindrome1(-121));
    }

    @Test
    public void isPalindrome3Test3() {
        Assert.assertFalse(p9.isPalindrome1(10));
    }
}