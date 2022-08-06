package com.leetcode;

public class leetcode383II {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] int1=new int[128];
        for (char c : ransomNote.toCharArray()) {
            int1[c]++;
        }
        for (char c : magazine.toCharArray()) {
            int1[c]--;
        }
        for (int i : int1) {
            if (i>1)return false;
        }
        return true;
    }
}
