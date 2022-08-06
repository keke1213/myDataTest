package com.HW;

import java.util.Scanner;

public class HJ106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(s) ;
        System.out.println(stringBuilder.reverse());
    }
}
