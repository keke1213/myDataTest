package com.leetcode;

public class leetcode125 {
    public static void main(String[] args) {
//        isPalindrome("race a car");
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        isPalindrome1("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome1(String s) {
        s=s.toUpperCase();
        int length = s.length();
        int start=0,end=length-1;
        while (start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){start++;}
            if(!Character.isLetterOrDigit(s.charAt(end))){end--;}
            if (s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindrome2(String s) {
        s=s.toUpperCase();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int length = s.length();
        int start=0,end=length-1;
        while (start<length){
            char c = s.charAt(start);
            if (Character.isLetterOrDigit(c)){
                sb1.append(c);
                sb2.append(c);
            }
            start++;
        }
        return sb1.reverse().toString().equals(sb2.toString());
    }
    //及格
    public static boolean isPalindrome(String s) {
//        s=s.replaceAll(" ","");
//        s=s.replaceAll(",","");
//        s=s.replaceAll(":","");
//        s=s.replaceAll("\\.","");

        s=s.toUpperCase();
        int length = s.length();
        int left=0,right=length-1;
        while (left<right){
            while (left<length-1&&s.charAt(left)<'A'||s.charAt(left)>'Z')left++;
            while (right>0&&s.charAt(right)<'A'||s.charAt(right)>'Z')right--;
            if (s.charAt(left)==s.charAt(right)){
                left++;right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
