package com.HW;

import java.util.Scanner;

public class leetCode204 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            count+=isPrime(i)?1:0;
        }
        return count;
    }
    public static boolean isPrime(int ax){
        for (int i=2;i*i<=ax;i++)
            if (ax%i==0)return false;
            return true;
    }
}
