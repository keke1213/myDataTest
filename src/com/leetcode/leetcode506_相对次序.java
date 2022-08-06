package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class leetcode506_相对次序 {
    public static void main(String[] args) {
//        findRelativeRanks(new int[]{5,4,3,2,1});
        findRelativeRanks(new int[]{10,3,8,9,4});
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] strings=new  String[]{"Gold Medal","Silver Medal","Bronze Medal"};
        int length = score.length;
        int[][] arr=new int[length][2];
        for (int i=0;i<length;i++){
            arr[i][0]=score[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        String[] str=new String[length];
        for (int i=0;i<length;i++){
            if (i>=3){str[arr[i][1]]=String.valueOf(i+1);}
            else {str[arr[i][1]]=strings[i];}
        }
        return str;
    }
}
