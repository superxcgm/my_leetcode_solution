package com.superxc.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P13 {
    public int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int curValue = map.get(ch);
            if (i - 1 >= 0) {
                char preCh = s.charAt(i - 1);
                int preValue = map.get(preCh);

                if (curValue > preValue) {
                    result += curValue - preValue;
                    // process two char at a time
                    i--;
                    continue;
                }
            }
            result += curValue;
        }

        return result;
    }
}
