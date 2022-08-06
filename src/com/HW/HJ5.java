package com.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str=br.readLine();
        int n=0;
        String s = str.replaceAll("0x", "");
//        System.out.println(Integer.parseInt(s, 16));
        for (int i=0;i<s.length();i++){
//            n+=s.charAt(i)-'A'>>(s.length()-1*4);
            int set =(s.length()-1-i)*4;
            int value;
            if(s.charAt(i)>='A'&&s.charAt(i)<='F'){
                 value=s.charAt(i) - 'A'+10;
            }else{
                 value=s.charAt(i) - '0';
            }

            n+=value<<set;
        }
        System.out.println(n);
    }
}
