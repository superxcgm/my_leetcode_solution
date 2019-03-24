package com.superxc.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P3Test {

    private P3 p3;

    @Before
    public void setUp() {
        p3 = new P3();
    }

    @Test
    public void p3_test_1() {
        assertEquals(3, p3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void p3_test_2() {
        assertEquals(1, p3.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void p3_test_3() {
        assertEquals(3, p3.lengthOfLongestSubstring("pwwkew"));
    }
}