package com.superxc.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        String openBrackets = "([{";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (openBrackets.contains(ch + "")) {
                stack.push(ch);
            } else if (stack.empty() || map.get(stack.pop()) != ch) {
                return false;
            }
        }

        return stack.empty();
    }
}
