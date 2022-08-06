package com.leetcode;

import java.util.HashMap;

public class leetcode205_同构字符串 {
    public static void main(String[] args) {
            String s="123";
            String s1=new String("123");
        System.out.println(s == s1);
    }
    public static boolean isIsomorphic(String s, String t) {
            if (s.length()!=t.length())return false;
            char[] chars = s.toCharArray();
            char[] chars1 = t.toCharArray();
            HashMap<Character,Character> hashMap=new HashMap<>();
            HashMap<Character,Character> hashMap1=new HashMap<>();
            for (int i=0;i< chars.length;i++){
                if (hashMap.containsKey(chars[i])&&hashMap.get(chars[i])!=chars1[i]||
                        hashMap.containsKey(chars1[i])&&hashMap1.get(chars1[i])!=chars[i]){
                    return false;
                }
                hashMap.put(chars[i],chars1[i]);
                hashMap1.put(chars1[i],chars[i]);
            }
            return true;
    }
}
