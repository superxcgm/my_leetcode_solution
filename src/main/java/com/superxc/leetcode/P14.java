package com.superxc.leetcode;

import java.util.Arrays;

public class P14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLength = Arrays.stream(strs).mapToInt(String::length).summaryStatistics().getMin();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
