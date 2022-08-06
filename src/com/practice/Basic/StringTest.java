package com.practice.Basic;

import java.util.stream.IntStream;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder("asdas");
        System.out.println(s.capacity());
        s.append(2.0d);
        System.out.println(s.indexOf("as"));
        System.out.println(s.insert(0, "rc"));
        IntStream chars = s.chars();
        System.out.println(s.capacity());
        s.ensureCapacity(46);
        System.out.println(s.capacity());
        s.trimToSize();
        "ssss".split("s");

        String ss="123";
        String[] split = ss.split("1");
        System.out.println(split[0]);


    }

}
