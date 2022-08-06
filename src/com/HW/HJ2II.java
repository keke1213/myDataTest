package com.HW;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HJ2II {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        String vlaue=br.readLine().toUpperCase();
        HashMap<String, Integer> hashMap=new HashMap<>();
        for (String s : str.split("")) {
            if (hashMap.containsKey(s)){
                Integer integer = hashMap.get(s);
                hashMap.put(s,++integer);
            }else {
                hashMap.put(s,1);
            }
        }

        System.out.println(hashMap.get(vlaue)==null?0:hashMap.get(vlaue));
    }
}