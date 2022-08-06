package com.HW;

import java.util.*;

public class leetCode77 {
    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists=new LinkedList<>();
        if (k <= 0 || n < k) {
            return lists;
        }
        Deque<Integer> path = new ArrayDeque<>(k);

        dfs(1,n,k,path,lists);
        return lists;
    }
    public static void dfs(int start,int n,int k,Deque<Integer> list1,List<List<Integer>> lists){
        if (0==k){
            lists.add(new ArrayList<>(list1));
            return;
        }
        if (start > n-k+1){
            return;
        }
        //不选择
        dfs(start+1,n,k,list1,lists);

        //选择
        list1.addLast(start);
        dfs(start+1,n,k-1,list1,lists);
        list1.removeLast();
    }
    
}
