package com.leetcode;

import java.util.Arrays;

/**
 * @author 莴笋
 * @date 2021/8/22 14:41
 */
class Solution1 {
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) ss[i] = "" + nums[i];
        Arrays.sort(ss, (a, b) -> {
            String sa = a + b, sb = b + a;
            return sb.compareTo(sa);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : ss) sb.append(s);
        int len = sb.length();
        int k = 0;
        while (k < len - 1 && sb.charAt(k) == '0') k++;
        return sb.substring(k);
    }

    public static void main(String[] args) {
        int[] next = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(next));
    }
}
