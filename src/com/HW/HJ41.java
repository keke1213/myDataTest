package com.HW;

import java.util.HashMap;
import java.util.Scanner;

public class HJ41 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            int n = scanner.nextInt();
            int[] key=new int[n];
            int[] value=new int[n];
            for (int i=0;i<n;i++){
                key[i]=scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                value[i]=scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                if (hashMap.containsKey(key[i])){
                    Integer integer = hashMap.get(key[i]);
                    hashMap.put(key[i],integer+value[i]);
                }else {
                    hashMap.put(key[i],value[i]);
                }
            }
            System.out.println();
        }

    }

}
