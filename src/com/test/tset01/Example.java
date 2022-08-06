package com.test.tset01;

import java.util.LinkedList;

public class Example {
    /**
     * 输入： s = "abcabcbb"
     * 输出：3
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(maxChildStr("abcabcbb"));
        System.out.println(maxChildStr("bbbbb"));
        System.out.println(maxChildStr("pwwkew"));
    }
    public static int maxChildStr(String str){
        int length = str.length();
        int max=1;
        int start=0,end=0;
        LinkedList<Character> linkedList=new LinkedList<>();
        for (;end<length;){
            char c = str.charAt(end);
            if (linkedList.contains(c)){
                linkedList.removeFirst();
                start++;
            }else {
                linkedList.add(c);
                max=Math.max(max,end-start+1);
                end++;
            }
        }
        return max;
    }
}
