package com.leetcode;

public class peakIndexInMountainArray852 {
    public static void main(String[] args) {
        int[] ints={0,10,5,2};
//        System.out.println(peakIndexInMountainArray(ints));
        System.out.println(peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int right=arr.length-1,left=0;
        int mid;
        while (left<right){
            mid=(right-left)/2;
            if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid+1]>arr[mid-1]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
