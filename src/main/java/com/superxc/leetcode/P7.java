package com.superxc.leetcode;

public class P7 {
    public int reverse(int x) {
        long sourceX = x;
        boolean isNegative = x < 0;

        if (isNegative) {
            sourceX = -sourceX;
        }
        String reverseStr = new StringBuilder(sourceX + "").reverse().toString();
        long reverseLong = Long.parseLong(reverseStr);

        if (isNegative) {
            reverseLong = -reverseLong;
        }

        // overflow
        if (reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverseLong;
    }
}
