package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcode1260 {
    public static void main(String[] args) {


    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> lists=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
//        int m=grid.length;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                linkedList.add(grid[i][j]);
            }
        }
        for(int i=0;i<k;i++){
            linkedList.addFirst(linkedList.removeLast());
        }
        for (int i=0;i<grid.length;i++){
            ArrayList<Integer>  arrayList=new ArrayList();
            for (int j=0;j<grid[i].length;j++){
               arrayList.add(linkedList.removeFirst());
            }
            lists.add(arrayList);
        }
        return lists;
    }
}
