package com.HW;


import java.util.*;
import java.util.stream.Stream;

public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String[] strings = new String[num];
        while (scanner.hasNext()){
            for(int i=0;i<num;i++){
                String key = scanner.next();
                strings[i]=key;
            }
            Stream<String> sorted = Arrays.stream(strings).sorted();
            Iterator<String> iterator = sorted.iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }
    }
}
