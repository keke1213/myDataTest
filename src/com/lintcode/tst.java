package com.lintcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class tst {
    public  static void  main(String [] args) throws Exception{
        Scanner s = new Scanner(System.in);
//        String words = s.nextLine();
//        String[] last = words.split(" ");
//        System.out.print(last[last.length-1].length());
        String[] s1 = s.nextLine().toUpperCase().split("");
        String s2 = s.nextLine().toUpperCase();
        HashMap<String,Integer>   hashMap = new HashMap<>();
        for (String string: s1
             ) {
            if (hashMap.containsKey(string)){
                Integer integer = hashMap.get(string);
                hashMap.put(string,++integer);
            }else {
                hashMap.put(string,1);
            }
        }
        Integer integer = hashMap.get(s2);
        if (integer==null){
            System.out.println(0);
        }else {
            System.out.println(integer);
        }


    }
}
