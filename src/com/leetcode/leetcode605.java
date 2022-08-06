package com.leetcode;

public class leetcode605 {
    public static void main(String[] args) {
    canPlaceFlowers(new int[]{0,0,1,0,1},
        2);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i=0;i<length;i++){
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0?true:false;
    }
}
