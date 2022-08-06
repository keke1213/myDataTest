package com.HW;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class HJ101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] ints=new Integer[n];
        while (scanner.hasNext()){
            for (int i=0;i<n;i++){
                ints[i]=scanner.nextInt();
            }
            int sc = scanner.nextInt();
            sort(ints,sc);
            for (Integer i:ints
                 ) {
                System.out.print(i+" ");
            }
        }


    }

    private static void sort(Integer[] ints, int sc) {
        if (sc==0){
            Arrays.sort(ints, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
        }else {
            Arrays.sort(ints, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
        }
    }



}
