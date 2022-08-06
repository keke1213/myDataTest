package com.HW;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class leetCode77II {
    public static void main(String[] args) {
        combine(4,2);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists =new ArrayList<>();
        int start=1;
        Deque<Integer> list=new ArrayDeque<>();
        dfs(1,n,k,list,lists);
        return lists;
    }
   public static void dfs(int start, int n, int k, Deque<Integer> list, List<List<Integer>> lists){
        if (list.size()==k){
            lists.add(new ArrayList<>(list));return;
        }
        if (start>n)return;
        dfs(start+1,n,k,list,lists);
       list.add(start);
        dfs(start+1,n,k,list,lists);
        list.removeLast();
   }
}
