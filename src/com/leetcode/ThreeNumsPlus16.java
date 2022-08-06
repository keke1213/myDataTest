package com.leetcode;

import java.util.Arrays;

public class ThreeNumsPlus16 {

    public static void main(String[] args) {
        int[] ints={-1,2,1,-4};
        int tag=1;
        int i = threeSumClosest(ints, tag);
        System.out.println(i);

    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int start=i+1,end=nums.length-1;
            while (start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if (Math.abs(target-sum)<Math.abs(target-min)){
                    min=sum;
                }else if (sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else {
                    return min  ;
                }
            }
        }
        return min;
    }
}
