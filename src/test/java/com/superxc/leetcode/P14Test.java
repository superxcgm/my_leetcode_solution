package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P14Test {

    private P14 p14;

    @Before
    public void setUp() throws Exception {
        p14 = new P14();
    }

    @Test
    public void longestCommonPrefixTest1() {
        String[] strs = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", p14.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefixTest2() {
        String[] strs = {"dog", "racecar", "car"};
        Assert.assertEquals("", p14.longestCommonPrefix(strs));
    }

}