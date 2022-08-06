package com.HW;

public class LeetCode674 {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int left=0,max=1;int count=0;
        for (int i=0;i<nums.length-1;i++){
            count++;
            if (nums[i]>nums[i+1]) {
                max = Math.max(max, count);
//                left=i;
                count = 0;
            }
        }
        return Math.max(max,++count);
    }
}
