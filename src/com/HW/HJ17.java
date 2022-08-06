package com.HW;


import java.util.Scanner;

public class HJ17 {
    public static void main(String[] args)   {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        int x=0,y=0;
        String[] split = str.split(";");
//        System.out.println(split.length);
        for (String  src:split
             ) {
            if(src.matches("(A|W|S|D)[0-9]{1,2}")){
//                System.out.println(src);
                switch (src.charAt(0)){
                    case 'A':
                        x=x-Integer.parseInt(src.substring(1,src.length()));break;
                    case 'W':
                        y=y+Integer.parseInt(src.substring(1,src.length()));break;
                    case 'S':
                        y=y-Integer.parseInt(src.substring(1,src.length()));break;
                    case 'D':
                        x=x+Integer.parseInt(src.substring(1,src.length()));break;
                }
            }
        }
        System.out.println(x+","+y);
    }
}
