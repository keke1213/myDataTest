package com.leetcode;

import java.util.HashMap;

/**
 * @author 莴笋
 * @date 2021/8/17 19:58
 */
public class Solution {
    public static void main(String[] args) {
        boolean flag = CheckRecord("PPALLL");
//        System.out.println(flag);
        B b = new B();
        b.p();
    }


    public static boolean CheckRecord(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 0);
        hashMap.put('L', 0);
        hashMap.put('P', 0);
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (hashMap.containsKey(c[i])) {
                count = hashMap.get(c[i]) + 1;
                hashMap.put(c[i], count);
            }
        }
        if (hashMap.get('A') >= 2 || s.contains("LLL")) {
            return false;
        } else {
            return true;
        }
    }
}

class A {
    public static void p() {
        System.out.println("A");
    }
}

class B extends A {
    public static void p() {
        System.out.println("B");
    }
}

