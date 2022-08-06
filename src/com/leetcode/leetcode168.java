package com.leetcode;

public class leetcode168 {
    public static void main(String[] args) {
   convertToTitle(52);
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        int c = columnNumber;
        while (c > 0) {
            //  if (c==26){
            //     stringBuilder.append('Z');break;
            // }
            c--;

            stringBuilder.append((char) c % 26 + 'A');

            c = (c - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }
}
