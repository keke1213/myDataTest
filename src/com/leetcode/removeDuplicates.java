package com.leetcode;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                ++i;
            }
            ++j;
        }

        return i;
    }
}
