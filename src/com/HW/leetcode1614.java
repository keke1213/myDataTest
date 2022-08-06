package com.HW;

import java.util.HashMap;
import java.util.Stack;

public class leetcode1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }
    public static int maxDepth(String s) {
        HashMap<String, String> hashMap =new HashMap<>();
        hashMap.put(")","(");
        Stack<String> stack=new Stack<>();
        int deep=0;
        for (String s1 : s.split("")) {
            if ("(".equals(s1)){
                stack.add(s1);
                deep=Math.max(deep,stack.size());
            }else if(")".equals(s1)){
                if (stack.peek().equals(hashMap.get(s1)))
                stack.pop();
            }
        }
        return deep;
    }
}
