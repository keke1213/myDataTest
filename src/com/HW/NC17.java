package com.HW;

public class NC17 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));

    }
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length<2)return s;

        boolean[][] status=new boolean[length][length];
        int maxLen=1;
        int begin=0;
//        for (int i=0;i<length;i++){
//            status[i][i]=true;
//        }
        for (int j=1;j<length;j++){
            for (int i=0;i<j;i++){
                if (s.charAt(i)!=s.charAt(j)){
                    status[i][j]=false;
                }else {
                    if (j-i<3){
                        status[i][j]=true;
                    }else {
                        status[i][j]=status[i+1][j-1];
                    }
                }
                if (status[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    begin=i;
                }
            }
        }
//        for (int j=1;j<length;j++){
//            for (int i=0;i<j;i++){
//
//            }
//        }
        return s.substring(begin,begin+maxLen);

    }
}
