package com.HW;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NC61 {
    public static void main(String[] args) {

    }
    public static int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(target-numbers[i])){
                Integer integer = hashMap.get(target - numbers[i]);
                int[] arr = new int[]{i+1,integer};
                Arrays.sort(arr);
                return arr;
            }else {
                hashMap.put(numbers[i],i+1);
            }
        }
        return null;
    }
}
