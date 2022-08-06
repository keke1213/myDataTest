package com.HW;

import java.util.Scanner;

public class HJ108 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<b){
            int temp;
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println(minYue(a,b));
        System.out.println(a*b/minYue(a,b));
    }
    public static int minYue(int a,int b){
        if (b==0){
            return a;
        }
        return minYue(b,a%b);
    }
}
