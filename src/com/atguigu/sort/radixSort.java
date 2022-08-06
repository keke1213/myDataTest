package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 基数排序 （桶排序）
 */
public class radixSort {
    public static void main(String[] args) {
//        int[] arr = {53, 3, 542, 748, 14, 214 };
//        radixSort(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arrr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arrr[i] = (int) (Math.random() * 8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("基数排序前" + dateStr1);
        radixSort(arrr);
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);
        System.out.println("基数排序后" + dateStr2);
//        System.out.println(Arrays.toString(arrr));
//        排序前2021-08-11 20:34:58  800w
//        排序后2021-08-11 20:34:59


    }

    public static void radixSort(int[] arr) {
        /**
         *num控制位数
         */
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxR = (max + "").length();//求出最高位数

        int[][] bucket = new int[10][arr.length]; //10个桶子 每个桶子不确定容量 采取最坏打算
        int[] bucketElementCounts = new int[10];//记录10个桶子里的数 及容量
        int num;
        int index;
        for (int i = 0, n = 1; i < maxR; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                num = arr[j] / n % 10;
                bucket[num][bucketElementCounts[num]] = arr[j];
                bucketElementCounts[num]++;
            }
            index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    for (int z = 0; z < bucketElementCounts[k]; z++) {
                        arr[index++] = bucket[k][z];
                    }
                }
                bucketElementCounts[k] = 0;
            }
        }


    }
}
