package com.practice.test;

import java.util.HashSet;
import java.util.LinkedList;

public class test05 {
    /**
     * 给定一个由小写字母组成的字符串，找出其中最长的一个不包含重复字符的子串
     * ，打印出其长度。例如输入 abcde 输出5；输入 abcabcd 输出4；
     * 输入 aaa 输出1； 输入 abacad 输出3
     * @param args
     */
    public static void main(String[] args) {
//        minStr("abcabcd");
//        minStr("aaa");
//        minStr("abcde");
//        minStr1("abacad");
        minStr1("abcabcd");//4
        minStr1("aaa");//1
        minStr1("abcde");//5
        minStr1("abacad");//3
    }
    public static void minStr1(String s){
        int length = s.length();
        int max=1;
        int index=0;
        LinkedList<Character> linkedList=new LinkedList<>();
        for (int i=0;i<length;){
            char c = s.charAt(i);
            if (linkedList.contains(c)){
                linkedList.removeFirst();
               index++;
           }else {
                linkedList.add(c);
               max=Math.max(max,i-index+1);
               i++;
           }
        }
        System.out.println(max);
    }
    public static void minStr(String s){
        int length = s.length();
        int max=1;
        int index=0;
        for (int i=1;i<length;){
            if (index>=length)break;
            if (s.charAt(index)==s.charAt(i)){
                index++;
            }else {
                max=Math.max(max,i-index+1);
                i++;
            }
        }
        System.out.println(max);
    }
}
