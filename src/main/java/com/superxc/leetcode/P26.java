package com.superxc.leetcode;

public class P26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int pre = nums[0];
        int l = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != pre) {
                nums[l++] = pre = nums[i];
            }
        }
        return l;
    }
}
