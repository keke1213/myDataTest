package com.leetcode;

import java.io.PrintStream;
import java.util.*;

/**
 * @author 莴笋
 * @date 2021/8/18 10:09
 */
public class test {

    public static void main(String args[]) {
        user user = new user();

//            System.out.println(user.hashCode());
//            System.out.println( user.setuser(user));
//            System.out.println(user.lengthOfLongestSubstring(" "));
//            HashMap hashMap = new HashMap();
//            String key;
//            key="Aa";
//            System.out.println(key.hashCode());
//            String key1;
//            key1="BB";
//            System.out.println(key1.hashCode());

//            Object key = new Date();
//            int h;
//            System.out.println((h = key.hashCode()) ^ (h >>> 16));
//            Object key1 = new Date();
//            int h1;
//            System.out.println((h1 = key1.hashCode()) ^ (h1 >>> 16));
        for (int i = 0; i < 32; i++)
            System.out.print(15 & i);

    }
}

class user {
    public int id;

    public user() {
    }

    public user(int id) {
        this.id = id;
    }

    public user setuser(user user) {
        user s = new user();
        return s;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, length = s.length();
        HashSet<String> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int i = 0; i < length - L + 1; i++) {
            String tmp = s.substring(i, i + L);
            if (set2.contains(tmp)) {
                set1.add(tmp);
            }
            set2.add(tmp);
        }
        return new ArrayList<>(set1);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    j++;
                } else {
                    maxLength = Math.max(j - i, maxLength);
                    i = j;
                }
            }
        }
        return maxLength;
    }
}

