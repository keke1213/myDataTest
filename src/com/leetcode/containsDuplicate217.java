package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,3,2,4}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for (int i=0;i< nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                return true;
            }
        }
        return false;
    }
}
