package com.HW;

import java.util.*;

public class NC52II {
    public static void main(String[] args) {
        isValid("([)]");
//        isValid("()[]{}");
    }
    public static boolean isValid (String s) {
        // write code here
        HashMap<String,String> hash=new HashMap<>();
        hash.put(")","(");
        hash.put("}","{");
        hash.put("]","[");
        Stack<String> stacknew =new  Stack<>();
        for (String s1 : s.split("")) {
            if (hash.containsKey(s1)&&!stacknew.isEmpty()){
                if (stacknew.peek().equals(hash.get(s1)))stacknew.pop();
            }else {
                stacknew.add(s1);
            }
        }
        return stacknew.isEmpty()?true:false;
    }
}
