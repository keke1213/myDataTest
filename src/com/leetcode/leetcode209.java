package com.leetcode;

public class leetcode209 {
    public static void main(String[] args) {
//        minSubArrayLen(7,new int[]{2,3,1,2,4,3});
        minSubArrayLen(11,new int[]{1,2,3,4,5});
    }
    //target = 7, nums = [2,3,1,2,4,3]
    public static int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        int start=0,end=0,sum=0;
        int min= Integer.MAX_VALUE;
        while (end<length){
            sum+=nums[end];
            while (sum>=target){
                min=Math.min(min,end-start+1);
                sum-=nums[start];
                start++;

            }
            end++;
        }
        System.out.println(min);
        return min==Integer.MAX_VALUE?0:min;
    }
}
