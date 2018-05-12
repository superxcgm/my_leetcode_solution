package com.superxc.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P21Test {

    private P21 p21;

    @Before
    public void setUp() throws Exception {
        p21 = new P21();
    }

    @Test
    public void mergeTwoListsTest() throws Exception {
        ListNode l1 = new ListNode(new int[]{1, 2, 4});
        ListNode l2 = new ListNode(new int[]{1, 3, 4});
        ListNode expected = new ListNode(new int[]{1, 1, 2, 3, 4, 4});

        Assert.assertEquals(expected, p21.mergeTwoLists(l1, l2));
    }
}