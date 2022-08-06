package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class    SelectSort {
    /**
     * 选择排序
     * 假设第一个元素最小
     * 然后与之后的比较
     * 找出最小的元素与其下标
     * 然后替换
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));


        int[] arrr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arrr[i] = (int) (Math.random() * 800000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("排序前" + dateStr1);
        SelectSort(arrr);
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);
        System.out.println("排序后" + dateStr2);


//        选择排序前2021-08-10 11:16:39          80w数据时间
//        选择排序后2021-08-10 11:19:30

//        排序前2021-08-10 11:20:18           8w数据使时间
//        排序后2021-08-10 11:20:20
    }


    public static void SelectSort(int[] arr) {
        int Min = 0;
        int MinIndex = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++)//n个数代表有n-1趟循环
        {
            Min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (Min > arr[j]) {
                    Min = arr[j];
                    MinIndex = j;
                    flag = true;
                }
            }
            if (flag) {
                arr[MinIndex] = arr[i];
                arr[i] = Min;
                flag = false;
            }
        }
    }
}
