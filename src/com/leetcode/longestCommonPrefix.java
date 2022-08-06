package com.leetcode;

import java.util.Set;
import java.util.TreeSet;

//最大的公共前缀
public class longestCommonPrefix implements Comparable {
    public static void main(String[] args) {
        String[] strs = {"flower", "flower", "flower", "flower"};
//        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        String start = strs[0];
        boolean flag = true;
        String publicStr = "";
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i <= start.length(); i++) {
            String pre = start.substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(pre)) {
                    flag = false;
                    break;
                }

            }

            if (!flag) {
                break;
            } else {
                publicStr = pre;
            }
        }

        return publicStr;
    }

    public static String longestCommonPrefix2(String[] strs) {
//        return "";
        Set<String> set = new TreeSet();
        for (int length = strs.length; length > 0; length--) {
            set.add(strs[length]);
        }
        return "";
    }

    @Override
    public int compareTo(Object o) {
        return ((String) o).compareTo(this.toString());
    }
}
