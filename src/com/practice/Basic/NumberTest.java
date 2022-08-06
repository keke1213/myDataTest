package com.practice.Basic;

import java.lang.reflect.Field;

public class NumberTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Number number = new Integer(1);
//        number.
        System.out.println(number.doubleValue());
        System.out.println(number);
//        Math.
        Class c = Number.class;
//        Object o = c.newInstance();
        Field[] fields = c.getFields();
        System.out.println(c.getName());
        
        for (Field field:fields
             ) {
            System.out.println(field);
        }


    }
}
