package com.HW;

import java.util.BitSet;
import java.util.List;

public class NC28 {
    public static void main(String[] args) {
//        System.out.println(minWindow("XDOYEZODEYXNZ", "XYZ"));
        System.out.println(minWindow("a", "aa"));
    }
    /**
     * S="XDOYEZODEYXNZ"
     * T ="XYZ"T="XYZ"
     * 找出的最短子串为"YXNZ""YXNZ".
     */
    public static String minWindow (String S, String T) {
        // write code here
        int[] hash=new int[128];
        int min= S.length()+1;
        int right=-1,left=-1;
        int fast=0,last=0;
        for (int i=0;i<T.length();i++){
            hash[T.charAt(i)]-=1;
        }
        for (;fast<S.length();fast++){
            char c = S.charAt(fast);
            hash[c]++;
            while (check(hash)){
                if(min>fast-last+1){
                    min=fast-last+1;
                    right=fast;
                    left=last;
                }
                char c1 = S.charAt(last++);
                hash[c1]--;
            }

        }
        if (left==-1)
            return "";
        return S.substring(left,right+1);


    }
    public static boolean check(int[] hash){
        for (int i=0;i<hash.length;i++){
            if (hash[i]<0){
                return false;
            }
        }
        return true;
    }

}
