package com.leetcode;

public class minCostClimbingStairs746 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
//        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }

    /**
     * 输入：cost = [1,100,1,1,1,100,1,1,100,1]
     * 输出：6
     * 解释：你将从下标为 0 的台阶开始。
     * - 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
     * - 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
     * - 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
     * - 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
     * - 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
     * - 支付 1 ，向上爬一个台阶，到达楼梯顶部。
     * 总花费为 6 。

     */
    public static int minCostClimbingStairs(int[] cost) {
        int p=0,q=0;
        for (int i=2;i<=cost.length;i++){
            int next=Math.min(cost[i-2]+p,cost[i-1]+q);
            p=q;
            q=next;

        }
       return q;
    }

}
