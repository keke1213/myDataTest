package com.leetcode;


public class LetterConvert6 {
    public static void main(String[] args) {
        System.out.println(convert("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.", 2));
        System.out.println(convert("PAYPALISHIRING", 6));
        System.out.println(convert("ABC", 2));
    }
    public static String convert(String s, int numRows) {
        if(s.length()<numRows||numRows==1){
            return s;
        }
//        int clo=2*s.length()/numRows+1;
//        int clo=s.length()/2;
        int clo=numRows*2-2;
        int c=(s.length()+clo-1)/clo*(numRows-1);
        char[][] chars = new char[numRows][c];
        int index = 0;
        int i = 0, j = 0;
        boolean flag = true;
        while (index < s.length()) {
            if (flag) {//向下
                if (i < numRows) {
                    chars[i][j] = s.charAt(index);
                    index++;
                    i++;
                } else {
                    flag = false;
                    j++;
                    i = i - 2;
                }
            } else {//向右上
                if (i >= 0) {
                    chars[i][j] = s.charAt(index);
                    index++;
                    j++;
                    i--;
                } else {
                    flag = true;
                    i = i + 2;
                    j--;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int r = 0; r < chars.length; r++) {
            for (int z = 0; z < chars[r].length; z++) {
                if (chars[r][z] != '\u0000') {
                    stringBuffer.append(chars[r][z]);
                }
            }
        }
        return stringBuffer.toString();
    }
}
