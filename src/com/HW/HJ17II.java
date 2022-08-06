package com.HW;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ17II{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str=reader.readLine();
        int x=0,y=0;
        for(String s:str.split(";")){
            if(s.matches("3")){
                switch(s.charAt(0)){
                    case 'A':x-=Integer.parseInt(s.substring(1));break;
                    case 'S':y-=Integer.parseInt(s.substring(1));break;
                    case 'W':y+=Integer.parseInt(s.substring(1));break;
                    case 'D':x+=Integer.parseInt(s.substring(1));break;

                }
            }
        }
        System.out.print(x+","+y);

    }
}
