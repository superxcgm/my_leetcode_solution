package com.superxc.leetcode;

public class P9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String xStr = x + "";

        int l = 0;
        int r = xStr.length() - 1;
        while (l <= r) {
            if (xStr.charAt(l) != xStr.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // without converting the integer to string
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int length = (int) Math.ceil(Math.log10(x));
        int result = 0;
        int times = length / 2;
        while (times-- > 0) {
            int tail = x % 10;
            result = result * 10 + tail;
            x /= 10;
        }
        if (length % 2 == 1) {
            x /= 10;
        }
        return x == result;
    }

}
