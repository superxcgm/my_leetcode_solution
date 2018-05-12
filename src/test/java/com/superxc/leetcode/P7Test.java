package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P7Test {

    private P7 p7;

    @Before
    public void setUp() throws Exception {
        p7 = new P7();
    }

    @Test
    public void reverseTest1() {
        Assert.assertEquals(321, p7.reverse(123));
    }

    @Test
    public void reverseTest2() {
        Assert.assertEquals(-321, p7.reverse(-123));
    }

    @Test
    public void reverseTest3() {
        Assert.assertEquals(21, p7.reverse(120));
    }
}