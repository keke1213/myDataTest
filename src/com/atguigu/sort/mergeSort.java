package com.atguigu.sort;

import java.util.Arrays;

/**
 * 归并排序法
 */
public class    mergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2, 2};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    //分
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
    //治

    /**
     * @param arr
     * @param left
     * @param mid   中间变量
     * @param right
     * @param temp  暂存数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int l = left;
        int r = mid + 1;
        int m = mid;
        int i = 0;
        /**
         *3步骤
         *  第一把两边的数存到temp中
         *  第二把剩下的依次存入temp
         *  第三把temp存回arr
         */
        while (l <= m && r <= right) {
            if (arr[l] > arr[r]) {
                temp[i] = arr[r];
                i++;
                r++;
            } else {
                temp[i] = arr[l];
                i++;
                l++;
            }
        }
        while (l <= m) {
            temp[i] = arr[l];
            i++;
            l++;
        }
        while (r <= right) {
            temp[i] = arr[r];
            i++;
            r++;
        }
        i = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[i];
            tempLeft++;
            i++;
        }
    }


}


