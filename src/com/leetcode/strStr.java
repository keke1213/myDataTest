package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class strStr {
    public static void main(String[] args) {
//        String haystack = "hello", needle = "ll";
//        System.out.println(strStr(haystack, needle));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.printf("i=%d,j=%d", i, j);

    }

    public static int strStr(String haystack, String needle) {
        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);
    }
}
