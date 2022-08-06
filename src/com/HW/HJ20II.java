package com.HW;


import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ20II {
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);
        String input = null;
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()){
            input=scanner.nextLine();
            isHefa(input);
        }

    }
    public static void  isHefa(String input){
        if (input.length()<8) {System.out.println("NG");return;}
        int count=0;
        Pattern p1 = Pattern.compile("[A-Z]");
        if (p1.matcher(input).find())count++;
        Pattern p2 = Pattern.compile("[a-z]");
        if (p2.matcher(input).find())count++;
        Pattern p3 = Pattern.compile("\\d");
        if (p3.matcher(input).find())count++;
        Pattern p4 = Pattern.compile("[^\\da-zA-z]");
        if (p4.matcher(input).find())count++;
        if (count<3){ System.out.println("NG");return;}
        for (int i=0;i<input.length()-3;i++){
            String str= input.substring(i,i+3);
            if (i!=input.lastIndexOf(str)){
                System.out.println("NG");return;
            }
        }
        System.out.println("OK");
    }
}
