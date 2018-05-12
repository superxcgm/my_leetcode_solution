package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P1Test {

    private P1 p1;

    @Before
    public void setUp() throws Exception {
        p1 = new P1();
    }

    @Test
    public void sumTest() {
        int[] expecteds = {0, 1};
        Assert.assertArrayEquals(expecteds, p1.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void sum1Test() {
        int[] expecteds = {0, 1};
        Assert.assertArrayEquals(expecteds, p1.twoSum1(new int[]{2, 7, 11, 15}, 9));
    }

}
