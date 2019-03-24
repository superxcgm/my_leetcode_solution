package com.superxc.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P3{
    // O(n)
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int start = 0, maxLength = 1;

        Map<Character, Integer> map = new HashMap<>();

        map.put(s.charAt(0), 1);
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (map.containsKey(ch) && start < i) {
                map.remove(s.charAt(start));
                start++;
            }
            map.put(ch, 1);
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
            }
        }

        return maxLength;
    }
}