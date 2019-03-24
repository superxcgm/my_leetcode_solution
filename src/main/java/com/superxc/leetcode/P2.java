package com.superxc.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class P2 {
    // O(MAX(n, m))
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), p;
        p = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val = carry;

            if (l1 != null){
                val += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                val += l2.val;
                l2 = l2.next;
            }

            carry = val / 10;
            val %= 10;

            p.next = new ListNode(val);
            p = p.next;
        }
        if (carry != 0) {
            p.next = new ListNode(carry);
        }
        return result.next;
    }
}