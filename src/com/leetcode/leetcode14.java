package com.leetcode;

public class leetcode14 {
    public static void main(String[] args) {
        System.out.println("c".indexOf("a"));
        longestCommonPrefix(new String[]{"c","acc","ccc"});
    }
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int length = str.length();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<length;i++){
            stringBuilder.append(str.charAt(i));
            for (int j=1;j<strs.length;j++){
                if (strs[j].indexOf(stringBuilder.toString())!=0)
                {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                    return stringBuilder.toString();
                }
            }
        }
        return stringBuilder.toString();
    }
}
