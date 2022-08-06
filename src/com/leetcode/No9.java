package com.leetcode;

public class No9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.isPalindrome(-121));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            int i, j;
            if (s.length() % 2 == 0) {
                i = s.length() / 2;
                j = s.length() / 2 - 1;
            } else {
                i = s.length() / 2;
                j = s.length() / 2;
            }
            while (j >= 0 && i < s.length()) {
                if (s.charAt(i++) == s.charAt(j--)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;

        }
    }
}
