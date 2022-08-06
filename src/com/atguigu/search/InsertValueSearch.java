package com.atguigu.search;


public class InsertValueSearch {

    public static void main(String[] args) {

        int[] arr = {1, 8, 10, 89, 1000, 1234};
        int index = insertValueSearch(arr, 0, arr.length - 1, 1234);
        System.out.println("index=" + index);
    }

    /**
     * 找到就返回对应的下标，没有找到，就返回-1
     * /**3.插值查找
     * 插值查找算法类似于二分查找，不同的是插值查找每次从自适应mid处开始查找，例如我们要从1~100找5这个数，
     * 那我们就会从前边开始找，插值查找就是应用这种原理
     * 插值公式： int mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);//插值
     */

    public static int insertValueSearch(int[] arr, int l, int r, int findVal) {

// 找不到条件, 后面的条件必须要
//1. findVal < arr[0] || findVal > arr[arr.length - 1]) 后面的条件必须要
//2. 因为 按照 没有的话 按照int midIndex = l + (findVal - arr[l]) / (arr[r] - arr[l]) * (r - l);
//   得到的 minIndex 可能越界。比如 要查的数很大，12340就得到 midIndex 为 50,越界了[debug]
        if (l > r || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return -1;
        }

        int midIndex = l + (findVal - arr[l]) / (arr[r] - arr[l]) * (r - l);
        int midVal = arr[midIndex];
        if (midVal > findVal) {
// 向左进行递归查找
            return insertValueSearch(arr, l, midIndex - 1, findVal);
        } else if (midVal < findVal) { // 向右进行递归查找
            return insertValueSearch(arr, midIndex + 1, r, findVal);
        } else {
            return midIndex;
        }
    }
}
