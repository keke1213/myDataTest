package com.HW;

import java.util.*;

public class HJ23 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String  str;
        str=scanner.nextLine();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (char c:str.toCharArray()
             ) {
            if (hashMap.containsKey(c)){
                Integer integer = hashMap.get(c);
                hashMap.put(c,++integer);
            }
            else {
                hashMap.put(c,1);
            }

        }
        Iterator<Integer> iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()){
            min=Math.min(min,iterator2.next());
        }
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
        List<Character> list=new ArrayList<>();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            if (next.getValue()==min){
                list.add(next.getKey());
            }
        }
        Iterator<Character> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            str=str.replaceAll(iterator1.next()+"","");
        }
        System.out.println(str);
//        System.out.println(list.toString());
//        System.out.println(hashMap.toString());
    }
}
