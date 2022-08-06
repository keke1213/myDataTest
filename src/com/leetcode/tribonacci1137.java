package com.leetcode;

public class tribonacci1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int p=0,q=0,r=1,s=1;
        for(int i=3;i<=n;i++){
            p=q;
            q=r;
            r=s;
            s=p+q+r;
        }
        return s;
    }
}
