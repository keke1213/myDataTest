package com.HW;

import java.util.*;

public class NC52 {
    public static void main(String[] args) {
//        Stack<String> q= new Stack();
//        q.add("{");
//        q.add("(");
//        q.add("[");
//        q.add("]");
//        q.add(")");
//        q.add("}");
//        System.out.println(q.size());
//        System.out.println(q.peek());
//        System.out.println(q.size());
//        System.out.println(q.pop());
//        System.out.println(q.size());
        isValid("{()}");
    }
    public static boolean isValid (String s) {
        // write code here
        HashMap<String, String> hashMap =new HashMap<>();
        hashMap.put(")","(");
        hashMap.put("]","[");
        hashMap.put("}","{");
        Stack<String> queue=new Stack<>();
        for (String s1 : s.split("")) {
            if(queue.isEmpty()){
                queue.add(s1);
            }else
            if (queue.peek().equals(hashMap.get(s1))){
                queue.pop();
            }else {
                queue.add(s1);
            }
        }
        return queue.isEmpty()?true:false;
    }
}
