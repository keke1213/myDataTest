package com.HW;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Long,Integer> hashMap=new TreeMap<>();
        int n=scanner.nextInt();
        while (scanner.hasNext()){
            for(int i=0;i<n;i++){
                Long key=scanner.nextLong();
                Integer value=scanner.nextInt();
                if (hashMap.containsKey(key)){
                    Integer integer = hashMap.get(key);
                    hashMap.put(key,integer+value);
                }else {
                    hashMap.put(key,value);
                }
            }
            Iterator<Map.Entry<Long, Integer>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Long, Integer> next = iterator.next();
                System.out.println(next.getKey()+" "+next.getValue());
            }
//            System.out.println(hashMap.toString());
        }
    }
}
