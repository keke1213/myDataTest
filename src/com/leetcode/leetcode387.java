package com.leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class leetcode387 {
    public static void main(String[] args) {

    }

    /**
     * leetcode
     * loveleetcode
     * aabb
     */
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> linkedList=new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (linkedList.containsKey(c)){
                Integer integer = linkedList.get(c);
                linkedList.put(c,++integer);
            }else {
                linkedList.put(c,1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> iterator = linkedList.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            if (next.getValue()==1)return s.indexOf(next.getKey());
        }
        return -1;

    }

    }
