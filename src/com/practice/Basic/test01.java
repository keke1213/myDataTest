package com.practice.Basic;

import java.lang.reflect.*;
import java.util.*;

public class test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> aClass = Class.forName("java.lang.Integer");
        Method m = aClass.getMethod("toString", int.class);
        Object o = aClass.newInstance();
        Object invoke = m.invoke(aClass, 2);
        System.out.println(invoke);
        List l = new ArrayList();
        l.get(1);
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        HashSet<String> s = new HashSet<String>();
        Object[] objects = s.toArray();
//        l.addAll(s);
//        LinkedHashMap<>(l);
//        HashSet
//        StringBuilder ss = "ss";
//        ss.re
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();


    }

}
