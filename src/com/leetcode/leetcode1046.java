package com.leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class leetcode1046 {
    public static void main(String[] args) {
        lastStoneWeight(new int[]{1,2,3,5,6});
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int stone : stones) {
            priorityQueue.add(stone);
        }
        while (priorityQueue.size()>1){
            Integer poll = priorityQueue.poll();
            Integer poll1 = priorityQueue.poll();
            int newstone=poll-poll1;
            if (newstone!=0)priorityQueue.add(newstone);
        }
        Integer poll = priorityQueue.poll();
        return poll!=null?poll:0;
    }
}
