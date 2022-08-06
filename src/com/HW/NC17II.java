package com.HW;

public class NC17II {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));;
    }
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length<2)return s;
        boolean[][] booleans = new boolean[length][length];
        int max=1;
        int begin=0;
        for (int j=1;j<length;j++){
            for (int i=0;i<=j;i++){
                if (s.charAt(i)!=s.charAt(j)){
                    booleans[i][j]=false;
                }else {
                    if (j-i==0){
                        booleans[i][j]=true;
                    }else {
                        booleans[i][j]=booleans[i+1][j-1];
                    }
                }
                if (booleans[i][j]&&j-i+1>max){
                    max=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+max);
    }
}
