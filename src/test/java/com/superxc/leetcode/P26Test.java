package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P26Test {

    private P26 p26;

    @Before
    public void setUp() throws Exception {
        p26 = new P26();
    }

    @Test
    public void removeDuplicatesTest1() {
        int[] arr = {1, 1, 2};
        assertArrayEqualsPrefixN(new int[]{1, 2}, arr, p26.removeDuplicates(arr));
    }

    @Test
    public void removeDuplicatesTest2() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        assertArrayEqualsPrefixN(new int[]{0, 1, 2, 3, 4}, arr, p26.removeDuplicates(arr));
    }


    private void assertArrayEqualsPrefixN(int[] l1, int[] l2, int n) {
        for (int i = 0; i < n; i++) {
            Assert.assertEquals(l1[i], l2[i]);
        }
    }
}