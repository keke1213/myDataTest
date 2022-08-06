package com.HW;

import java.util.Scanner;

public class HJ60 {
    public static void main(String[] args) {
//        System.out.println(25%6+" "+isPrime(25));
//        System.out.println(25%6+" "+is(25));
        Scanner scanner=new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int right = 0,left=0;
        int min=nextInt;
        for (int i=nextInt/2;i<nextInt;i++){
            if (!isPrime(i))continue;
            if (!isPrime(nextInt-i))continue;
            if (min>i-(nextInt-i)){
                min=i-(nextInt-i);
                right=nextInt-i;
                left=i;
            }
        }
        System.out.printf(right+"\n"+left);
//
    }
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++)
            //计算机处理乘法（或乘方）要比除法（或根式）要快。
            //所以，i <= sqrt(n) 写成 i*i <= n 可以微小优化。
            if (n % i == 0)
                return false;
        return true;
    }
    public static boolean is(int x){
        if (x <= 1) return false;
        if (x == 2 || x == 3) return true;
        if (x % 6 != 1 && x % 6 != 5) return false;
        for (int i = 6; i*i <= x; i += 6)
            if (x % (i-1) == 0 || x % (i+1) == 0)
                return false;
        return true;
    }
}
