package com.HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;

public class HJ20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        boolean type=true;
        StringBuffer sb = new StringBuffer();
        input=reader.readLine();
        while (!input.equals("exit")){
            HashSet<String> hashSet = new HashSet<>();
            for (String src:input.split("")
            ) {
                if (sb.length()==2){
                    if (hashSet.contains(sb.toString())){
                        type=false;
                    }
                    hashSet.add(sb.toString());
                    sb=sb.deleteCharAt(0);
                    sb.append(src);
                }else {
                    sb.append(src);
                }
            }
            if (!type){
                System.out.println("NG");
            }else{
                if(input.matches("\\w")){ System.out.println("OK");type=true;}
                else{System.out.println("NG"); type=true;}
            }
            input=reader.readLine();
        }
    }
}
