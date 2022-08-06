package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 插入排序
 * 分成两组
 * 把元素插入到有序的一组
 * 采用后移的方式
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrr = new int[800000];
        for (int i = 0; i < 800000; i++) {
            arrr[i] = (int) (Math.random() * 8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("希尔插入排序前" + dateStr1);
        InsertSort(arrr);
//        System.out.println(Arrays.toString(arrr));
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);
        System.out.println("希尔插入排序后" + dateStr2);

//        插入排序前2021-08-10 19:18:53  80w数据
//        插入排序后2021-08-10 19:20:52
    }

    public static void InsertSort(int[] arr) {

        boolean flag = false;
        int temp;
        int tempIndex;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            tempIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    tempIndex = j;
                    flag = true;
                }
            }
            if (flag) {
                arr[tempIndex] = temp;
                flag = false;
            }
        }
    }
}
