package com.collection;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Stream;

public class ListTest {
    public static void main(String[] args) {
//        List l1 = new LinkedList();
//        List<Integer> l2 = new ArrayList();
//        List l3 = new Vector();
//        l1.add("111");
//        System.out.println(l1.size());
//        Iterator iterator = l1.iterator();
//        iterator.next();

//        l2.add(1111);
//        System.out.println(l2.size());
//        Integer[] integers = new Integer[l2.size()];
//        Integer[] integer = l2.toArray(integers);
//        HashSet<Integer> hashSet = new HashSet<>();
//        Collections.synchronizedSet(hashSet);
//        Collections.synchronizedCollection(hashSet);
//        while(l2.size()<8){
//            l2.add(l2.size()+1);
//        }
//        System.out.println(l2.toString());
//        //test
//        l2.add(2,111);
//        l2.get(5);
//        l2.remove(6);
//        l2.set(7,222);
//        l2.add(null);
////        Stream<Integer> sorted = l2.stream().sorted();
//        Iterator<Integer> iterator = l2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(l2.toString());
//        ListTest l = new ListTest();
//        System.out.println(l.sort("asdfghjkqwertyuiERTYUghjkTgvbn"));


            }

    public List<String> sort(String letter) {
        String[] split = letter.split("");
        Arrays.sort(split,String.CASE_INSENSITIVE_ORDER);
        return Arrays.asList(split);
    }

    public static List<String> sortName(List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toUpperCase().compareTo(o2.toUpperCase());
            }

        });
        return list;
    }
}
