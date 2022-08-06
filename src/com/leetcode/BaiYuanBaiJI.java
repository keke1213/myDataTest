package com.leetcode;

public class BaiYuanBaiJI {
    public static void main(String[] args) {
        int r = 0;
        for (int i = 1; i <= 50; i++) {

            for (int j = 1; j <= 100; j++) {

                for (int k = 1; k <= 100; k++) {
//                    System.out.println(++r);
                    if (i * 2 + j * 1.5 + k * 0.5 == 100 && i + j + k == 100) {
                        System.out.printf("i=%d,j=%d,k=%d\n", i, j, k);
                    }
//                    else {
//
//                    }
                }
            }
        }
    }
}
