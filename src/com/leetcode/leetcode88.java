package com.leetcode;

import java.util.Arrays;

public class leetcode88 {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m++]=nums2[i];
        }
        for (int i=0;i<nums1.length-1;i++){
            for (int j=i+1;j< nums1.length;j++){
                if (nums1[i]>nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}
