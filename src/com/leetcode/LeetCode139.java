package com.leetcode;

import java.util.*;
//"cars"
//        ["car","ca",""]"
//"leetcode"
//        ["leet","code"]
//        aaaaaaa"
//["aaaa","aaa"]

public class LeetCode139 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("leet");
        list.add("code");
//        list.add("rs");
        wordBreak("leetcode",list);
    }
    //失败
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean first,second;
        Iterator<String> iterator = wordDict.iterator();
        String newS=s;
        while (iterator.hasNext()){
            String next = iterator.next();
            newS = newS.replaceAll(next, " ");
        }
        first=newS.trim().length()==0?true:false;
        wordDict.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        Iterator<String> iterator1 = wordDict.iterator();
        String newS1=s;
        while (iterator1.hasNext()){
            String next = iterator1.next();
            newS1 = newS1.replaceAll(next, " ");
        }
        second=newS1.trim().length()==0?true:false;

        return first||second;
    }
}
