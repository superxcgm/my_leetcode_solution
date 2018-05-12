package com.superxc.leetcode;

import java.util.Objects;

public class P21 {
    // ugly code, concise version see: https://leetcode.com/problems/merge-two-sorted-lists/discuss/9713/A-recursive-solution
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode pre = root;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = new ListNode(l1.val);
                pre = pre.next;
                l1 = l1.next;
            } else {
                pre.next = new ListNode(l2.val);
                pre = pre.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            pre.next = new ListNode(l1.val);
            pre = pre.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            pre.next = new ListNode(l2.val);
            pre = pre.next;
            l2 = l2.next;
        }
        return root.next;
    }
}

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int[] values) throws Exception {
        if (values == null || values.length == 0) {
            throw new Exception();
        }
        val = values[0];
        ListNode cur = this;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }
}
