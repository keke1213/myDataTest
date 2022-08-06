package com.leetcode;

public class climbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        return climb(n - 1) + climb(n - 2);
    }

    public static int climb(int n) {
        if (n - 1 == 0) {
            return 1;
        } else if (n - 2 == 0) {
            return 1;
        } else {
            return climb(n - 1) + climb(n - 2);
        }
    }

}
