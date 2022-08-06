package com.leetcode;

import java.util.Arrays;

public class maxSubArray53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] nums) {
        int pre=nums[0];
        for (int i=1;i<nums.length;i++){
            if (pre>0){
                nums[i]=pre+nums[i];
                pre=nums[i];
            }else {
                pre=nums[i];
            }
            
        }
        Arrays.sort(nums);

        return nums[nums.length-1];

    }
}
