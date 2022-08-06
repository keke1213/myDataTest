package com.collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class QunenTest {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> integerListMap = orderByFrequency(new int[]{5, 4, 4, 0, 0, 1});
        System.out.println(integerListMap.toString());
        Iterator<Map.Entry<Integer, List<Integer>>> iterator = integerListMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static Map<Integer, List<Integer>> orderByFrequency(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
//        TreeMap<Integer,List<Integer>> h2 = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
        TreeMap<Integer,List<Integer>> h2 = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            Integer integer = h1.get(nums[i]);
            if(integer!=null){
                h1.put(nums[i],++integer);
            }else{
                h1.put(nums[i],1);
            }
        }
        Iterator t = h1.keySet().iterator();
        while(t.hasNext()){
            Integer key = (Integer) t.next();
            Integer integer = h1.get(key);
            List<Integer> integers = h2.get(integer);
            if(integers==null){
                List<Integer> list= new ArrayList();
                list.add(key);
                h2.put(h1.get(key),list);
            }else {
                List<Integer> integers1 = h2.get(integer);
                integers1.add(key);
                h2.put(integer,integers1);
            }
        }

        return h2;
    }
}
