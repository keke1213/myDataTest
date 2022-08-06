package com.HW;

import java.util.HashMap;
import java.util.*;

public class LeetCode1614II {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public static int maxDepth(String s) {
        HashMap<String,String> hashmap =new HashMap<>();
        hashmap.put(")","(");
        Stack<String> qun=new Stack<>();
        int max=0;
        for(String str:s.split("")){
            if("(".equals(str)){
                qun.add(str);
            }
            if(")".equals(str)){
                String pop = qun.peek();
                if (hashmap.get(s)!=pop)qun.pop();

            }
            max=Math.max(max,qun.size());
        }
        return max;
    }
}
