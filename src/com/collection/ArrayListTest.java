package com.collection;

import java.util.*;
import java.util.stream.IntStream;

public class ArrayListTest
{
    public static void main(String[] args) {
        int[] a  = new int[]{1,2,3,1,1,1,1,1,1};
        HashSet hashSet = new HashSet(Collections.singleton(a));
        System.out.println(hashSet.toString());
        IntStream distinct = Arrays.stream(a).distinct();
        System.out.println(distinct.sum());
        ArrayList<Integer> doubleList = new ArrayList<Integer>();
        for (int i=1;i<=10;i++){
            doubleList.add(i);
        }
        System.out.println(watch(doubleList).toString());
    }
    public static List watch(ArrayList<Integer> list){
        ArrayList<Integer> doubleList = new ArrayList<Integer>();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Integer i= (Integer) iterator.next();
            if(i%2==0){
                doubleList.add(i);
            }
        }
        System.out.println(doubleList.toString());
        return  doubleList;
    }

    public int[] mergeArray(int arr1[], int arr2[]) {
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);

        PrimitiveIterator.OfInt iterator = Arrays.stream(arr3).distinct().iterator();


        return Arrays.stream(arr3).distinct().sorted().toArray();


    }
}
