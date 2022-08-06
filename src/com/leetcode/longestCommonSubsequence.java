package com.leetcode;

/**
 * @author 莴笋
 * @date 2021/8/21 22:39
 */
public class longestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        int value = longestCommonSubsequence(text1, text2);
        System.out.println(value);
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] len = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    len[i][j] = len[i - 1][j - 1] + 1;
                } else {
                    len[i][j] = Math.max(len[i - 1][j], len[i][j - 1]);
                }
            }
        }

        return len[text1.length()][text2.length()];
    }
}
