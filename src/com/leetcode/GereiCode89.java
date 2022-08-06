package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GereiCode89 {
    public static void main(String[] args) {
//        System.out.println(grayCode(4));
        System.out.println(1 << 1);
        System.out.println(0 ^ 0);
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i);
        }
        return ret;
    }
    public static void dfs(List<Integer> list, int n){

    }
}
