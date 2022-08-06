package com.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ5II {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str=br.readLine();
        str=str.substring(2);
        int value=0;
        for(char c:str.toCharArray()){
            if(c>='A'&&c<='F')
                value=value*16+c-'A'+10;
            else
                value=value*16+c-'0';
        }
        System.out.print(value);
    }
}