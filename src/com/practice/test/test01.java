package com.practice.test;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public class test01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        Comparable 可比
//        Comparator 比较器

        Date date=new Date();
        Class<? extends Date> aClass = date.getClass();
        Class<Date> dateClass = Date.class;
        Date date1 = dateClass.newInstance();
        System.out.println(date);
//        Serializable



    }

}
