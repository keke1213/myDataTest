package com.leetcode;

public class fib509 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n) {
        if(n<2){
            return n;
        }
//        return fib(n-1)+fib(n-2);
        int p=0,q=0,r=1;
        for(int i=2;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
