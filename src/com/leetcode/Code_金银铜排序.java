package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Code_金银铜排序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int[][] arr=new int[nextInt][3];
        for (int i=0;i<nextInt;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        Comparator<int[]> comparator=new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0]){
                    return o2[0]-o1[0];
                }
                if (o1[1]!=o2[1]){
                    return o2[1]-o1[1];
                }
                if (o1[2]!=o2[2]){
                    return o2[2]-o1[2];
                }else {
                    return 0;
                }
            }
        };
        Arrays.sort(arr,comparator);
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
