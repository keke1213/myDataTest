package com.HW;

public class NC28II {
    public static void main(String[] args) {
        System.out.println(minWindow("XDOYEZODEYXNZ", "XYZ"));
    }
    //X D O Y E Z O D E Y  X  N  Z
    //1 2 3 4 5 6 7 8 9 10 11 12 13
    public static String minWindow (String S, String T) {
        // write code here
        int[] words=new int[128];
        for (char c : T.toUpperCase().toCharArray()) {
            words[c]-=1;
        }
        int fast=0,slow=0;
        int left=-1,right=-1;
        int min= Integer.MAX_VALUE;
        char[] chars = S.toUpperCase().toCharArray();
        for (;fast<chars.length;fast++) {
            words[chars[fast]]++;
            while (is(words)){
                if(fast-slow+1<min){
                    right=fast;
                    left=slow;
                    min=right-left+1;
                }
                words[chars[slow++]]--;
            }
        }
        if (left==-1)return "";
        return S.substring(left,right+1);
    }
    public static boolean is(int[] ints){
        for (int anInt : ints) {
            if (anInt<0)return false;
        }
        return true;
    }
}
