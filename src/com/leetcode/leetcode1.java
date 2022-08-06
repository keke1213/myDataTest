package com.leetcode;

import java.util.HashMap;

public class leetcode1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int length = nums.length;
        for (int i=0;i<length;i++){
            if (hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]),i};
            }else {
                hashMap.put(target-nums[i],i);
            }
        }
        return new int[]{};

    }
}
