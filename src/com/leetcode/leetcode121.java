package com.leetcode;

public class leetcode121 {
    public static void main(String[] args) {
//        maxProfit(new int[]{7,1,5,3,6,4});
        maxProfit(new int[]{7,6,4,3,1});
    }
    //待改进
    public static int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int minIndex=0;
        int max= 0;
        for (int i=0;i<prices.length;i++){
            if (min>prices[i]){
                min=prices[i];
                minIndex=i;
            }
        }

        for (int i=minIndex+1;i<prices.length;i++){
            if (max<prices[i]-min){
                max=prices[i]-min;
            }
        }
        return max;
    }
}
