package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class MS40 {
    public static void main(String[] args) {

    }
    public static int[] getLeastNumbers(int[] arr, int k) {

        int[] newint=new int[k];
        Arrays.sort(arr);
        for (int i=0;i<k;i++){
            newint[i]=arr[i];
        }return newint;
    }
}
