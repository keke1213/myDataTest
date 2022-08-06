package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {
    /**
     * 快速排序法
     * 首先选定一个数作为校对数
     * 把比它大的放右边小的放左边
     * 此时左右边不一定为有序 所以反复此操作
     * 用递归
     */

    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2, 2};
        QuickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


        int[] arrr = new int[80000000];
        for (int i = 0; i < 80000000; i++) {
            arrr[i] = (int) (Math.random() * 8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("排序前" + dateStr1);
        quickSort(arrr.length - 1, 0, arrr);
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);
        System.out.println("排序后" + dateStr2);
//        System.out.println(Arrays.toString(arrr));

    }

    public static void quickSort(int left, int right, int[] arr) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) {
                r -= 1;
            }
            if (arr[r] == pivot) {
                l += 1;
            }
        }
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(left, r, arr);
        }
        if (right > l) {
            quickSort(l, right, arr);
        }
    }

    /**
     * @param arr
     * @param left
     * @param right
     */
    public static void QuickSort(int[] arr, int left, int right) {
        int ll = left,
                rr = right,
                temp = 0;
        int mid = arr[(rr + ll) / 2];
        while (ll < rr) {
            while (arr[rr] > arr[mid]) {
                rr--;
            }
            while (arr[ll] < arr[mid]) {
                ll++;
            }
            if (ll >= rr) {
                break;
            }
            temp = arr[rr];
            arr[rr] = arr[ll];
            arr[ll] = temp;

            if (arr[ll] == arr[mid]) {
                rr--;
            }
            if (arr[rr] == arr[mid]) {
                ll++;
            }
            //防止栈溢出
            if (ll == rr) {
                ll++;
                rr--;
            }
            //向左递归
            if (left < rr) {
                QuickSort(arr, left, rr);
            }
            //向右递归
            if (right > ll) {
                QuickSort(arr, ll, right);
            }
        }

    }

    public static void QuickSort2(int[] arr, int left, int right) {
        int ll = left,
                rr = right,
                temp = 0;
        int mid = (rr + ll) / 2;
        while (ll < rr) {
            while (arr[rr] > arr[mid]) {
                rr--;
            }
            while (arr[ll] < arr[mid]) {
                ll++;
            }
            if (ll < rr) {
                temp = arr[rr];
                arr[rr] = arr[ll];
                arr[ll] = temp;
                rr--;
                ll++;
            } else {
                break;
            }
            if (arr[ll] == arr[mid]) {
                rr--;
            }
            if (arr[rr] == arr[mid]) {
                ll++;
            }
            if (ll == rr) {
                ll++;
                rr--;
            }
            if (left < rr) {
                QuickSort2(arr, left, ll);
            }
            if (right > ll) {
                QuickSort2(arr, rr, right);
            }
        }

    }
}
