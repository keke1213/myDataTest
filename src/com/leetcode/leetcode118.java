package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists =new ArrayList<>();
        int[][] ints=new int[numRows][numRows];
        for (int i=0;i<numRows;i++){
            ints[i][i]=1;
            ints[i][0]=1;
        }
        for (int i=2;i<numRows;i++){
            for (int j=1;j<i+1;j++){
                ints[i][j]=ints[i-1][j]+ints[i-1][j-1];
            }
        }
        for (int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for (int j=0;j<i+1;j++){
                list.add(ints[i][j]);
            }
            lists.add(list);
        }

        return lists;
    }
}
