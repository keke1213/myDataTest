package com.leetcode;

import java.util.Arrays;

public class DiffrentePath62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    public static int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];
//        Arrays.fill(arr,1);
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                if(j==0&&i==0){
//                    continue;
                    arr[i][j]=1;
                }
                else if(j==0){
                    arr[i][j]=arr[i-1][j];
                }
                else if(i==0){
                    arr[i][j]=arr[i][j-1];
                }else {
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }
}
