package com.collection;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>();
        Person p1= new Person(17,"rc");
        Person p2= new Person(18,"fj");
        Person p3= new Person(13,"zb");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator<Person> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Person max = Collections.max(set,Person::compareTo);
        System.out.println(max);


    }
}
