package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
//        boolean flag = true ;
        Stack<Character> stack = new Stack<Character>();
        char[] c = s.toCharArray();
        if (s.length() % 2 != 0 || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                if (stack.isEmpty() || stack.peek() != map.get(c[i])) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c[i]);
            }
        }
        return stack.size() == 0;
    }
}



