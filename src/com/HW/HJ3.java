package com.HW;
import org.omg.PortableInterceptor.INACTIVE;


import java.util.Iterator;

import java.util.Scanner;
import java.util.TreeSet;

public class HJ3 {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        int read = s.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i<read;i++){
            int i1 = s.nextInt();
            treeSet.add(i1);
        }
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
