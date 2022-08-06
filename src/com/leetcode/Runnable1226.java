package com.leetcode;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Runnable1226 {
    public static void main(String[] args) {
//        ReentrantLock reentrantLock = new ReentrantLock(true);
//        Semaphore semaphore = new Semaphore(1);

        String s = "cars";
        List<String> wordDict=new ArrayList<String>();
        wordDict= Arrays.asList(new String[]{
                "car","ca","rs"});
        System.out.println(w(s, wordDict));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        int length=0;
        for(int i=0; i<wordDict.size();i++){
            length=s.length();
            s=s.replaceAll(wordDict.get(i), "");
            if ("".equals(s)){
                break;
            }
        }
        return "".equals(s)?true:false;

    }
    public static boolean w(String s, List<String> wordDict)
    {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
