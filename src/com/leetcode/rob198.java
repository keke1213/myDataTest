package com.leetcode;

public class rob198 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{2,7,9,3,1}));
    }

    /**
     输入：[2,7,9,3,1]
     输出：12
     解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
          偷窃到的最高金额 = 2 + 9 + 1 = 12 。
     */
    public static int minCostClimbingStairs(int[] cost) {
        int p=0,q=0;
        for (int i=2;i<=cost.length;i++){
            int next=Math.max(cost[i-2]+p,cost[i-1]+q);
            p=q;
            q=next;
        }
       return q;
    }
}
