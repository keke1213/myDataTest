package com.atguigu.sparseArrange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 稀疏数组
 */
public class SparseArrange {


    public static void main(String[] args) throws IOException {

        int[][] wuZiQi = new int[7][11];
        wuZiQi[1][1] = 1;
        wuZiQi[2][3] = 2;
        int sum = 0;//非零总数
        for (int[] data : wuZiQi
        ) {
            for (int item : data
            ) {
//                System.out.print(item+"  ");
                if (item != 0) {
                    sum++;
                }
            }
//            System.out.println();
        }
        int sparesArrange[][] = new int[sum + 1][3];
        sparesArrange[0][0] = wuZiQi.length;
        sparesArrange[0][1] = wuZiQi[0].length;
        sparesArrange[0][2] = sum;


        int count = 0;//计数器
        int i = 0;
        int j = 0;
        for (int[] data : wuZiQi
        ) {
            for (int item : data
            ) {
                if (item != 0) {
                    count++;
                    sparesArrange[count][0] = i;
                    sparesArrange[count][1] = j;
                    sparesArrange[count][2] = item;
                }
                j++;
            }
            i++;
            j = 0;
        }

        for (int[] data : sparesArrange
        ) {
            for (int item : data
            ) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        int[][] newArrange = new int[sparesArrange[0][0]][sparesArrange[0][1]];
//        System.out.println(newArrange);

        for (int ii = 1; ii < sparesArrange.length; ii++) {
            newArrange[sparesArrange[ii][0]][sparesArrange[ii][1]] = sparesArrange[ii][2];
        }
        System.out.println(newArrange);
        System.out.println();
        for (int[] data : newArrange
        ) {
            for (int item : data
            ) {
                System.out.print(item + "  ");

            }
            System.out.println();
        }
    }


}
