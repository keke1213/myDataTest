package com.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leetcode73 {
    public static void main(String[] args) {
//            setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
            setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }

    /**
     * [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     * [[1,1,1],[1,0,1],[1,1,1]]
     * 1 找到所有的0的下表存入到map :i,j
     * 2 遍历map 把所有下表为 [i][j++] and [i+i*j][j]
     * @param matrix
     */
    public static void setZeroes(int[][] matrix) {
        //行列
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<int[]> arrayList=new ArrayList<>();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==0){
                    arrayList.add(new int[]{i,j});
                }
            }
        }
        Iterator<int[]> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            int[] next = iterator.next();
            Integer key = next[0];
            Integer value = next[1];
            //定义一个双指针从中间开始向两端赋值
            //给同一行赋值 j变 从j开始
            int right=value,left=value;
            while (right<col||left>0){
                if (++right<col)matrix[key][right]=0;
                if (--left>=0)matrix[key][left]=0;
            }
            //给同一列赋值i变
            right=key;left=key;
            while (right<row||left>0){
                if (++right<row)matrix[right][value]=0;
                if (--left>=0)matrix[left][value]=0;
            }

        }
        System.out.println();



    }
}
