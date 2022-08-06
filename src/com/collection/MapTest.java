package com.collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//        HashMap hashMap = new HashMap();
//        hashMap.put(1,"one");
//        hashMap.put(2,"two");
//        hashMap.put(3,"three");
//        System.out.println(hashMap.containsKey(4));
//        System.out.println(hashMap.containsValue("one"));
//
//        Set set = hashMap.entrySet();
//        Set set1 = hashMap.keySet();
//        System.out.println(set.size());
//        System.out.println(set.contains(1));
//        System.out.println(set.contains("one"));
//        System.out.println(set.toString());
//        System.out.println(set1.size());
//        System.out.println(set1.contains(1));
//        System.out.println(set1.contains("one"));
//        System.out.println(set1.toString());
//
//        Iterator iterator = hashMap.keySet().iterator();


        Map<Integer,String> map = new HashMap<>();
        for (int i=1;i<24;i++){
            map.put(i,""+i);
        }
        map.put(33,""+33);




//        Collection<String> values = map.values();
//        Iterator<String> iterator = values.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()); //javacc#python
//        }
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()); //1234
//        }
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//1=java2=c3=c#4=python
        }
        System.out.println(map.size());
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();

    }
}
