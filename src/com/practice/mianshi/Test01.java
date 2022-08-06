package com.practice.mianshi;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Test01 {
    public static void main(String[] args) {
//        printNum("CaCO3");
        printNum2("Fe2(SO4)3");
    }
    public static void printNum(String string){
        String matche="[A-Z]{0,1}[a-z]{0,1}[0-9]{0,1}";
//        string.matches("[A-Z]{0,1}[a-z]{0,1}[0-9]{0,1}");
//        Stack<String> stack=new Stack();
        HashMap<String,Integer> hashMap=new HashMap<>();
        int length = string.length();
        int index=0;
        for (int i=0;i<length;i++){
            String substring = string.substring(index, i);
            if (!substring.matches(matche)){
                if (string.charAt(i-1)>'0'&&string.charAt(i-1)<'9'){
                    hashMap.put(string.substring(index,i-1),string.charAt(i-1)-'0');
                }else {
                    hashMap.put(string.substring(index,i-1),1);
                }
               index=--i;
            }
        }
        if (string.charAt(length-1)>'0'&&string.charAt(length-1)<'9'){
            hashMap.put(string.substring(index,length-1),string.charAt(length-1)-'0');
        }else {
            hashMap.put(string.substring(index,length-1),1);
        }
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.print(next.getKey()+next.getValue());
        }

    }
    public static void printNum2(String string){
        String matche="[A-Z]{0,1}[a-z]{0,1}[0-9]{0,1}";
//        string.matches("[A-Z]{0,1}[a-z]{0,1}[0-9]{0,1}");
//        Stack<String> stack=new Stack();
        HashMap<String,Integer> hashMap=new HashMap<>();
        int length = string.length();
        int index=0;
        boolean flag=false;//用来判断是否遇到()
        HashMap<String,Integer> in=new HashMap<>();
        for (int i=0;i<length;i++){
//            括号内
            if (string.charAt(i)=='('){
                flag=true;
                if (string.charAt(i-1)>'0'&&string.charAt(i-1)<'9'){
                    hashMap.put(string.substring(index,i-1),string.charAt(i-1)-'0');
                }else {
                    hashMap.put(string.substring(index,i-1),1);
                }
                index=++i;
            }
            if (string.charAt(i)==')'){
                if (string.charAt(i-1)>'0'&&string.charAt(i-1)<'9'){
                    in.put(string.substring(index,i-1),string.charAt(i-1)-'0');
                }else {
                    in.put(string.substring(index,i-1),1);
                }
                flag=false;
                int beiShu=1;
                if (string.charAt(i+1)>'0'&&string.charAt(i+1)<'9'){beiShu=string.charAt(i+1)-'0';}

                Iterator<Map.Entry<String, Integer>> iterator = in.entrySet().iterator();
                while (iterator.hasNext()){
                    Map.Entry<String, Integer> next = iterator.next();
                    hashMap.put(next.getKey(),next.getValue()*beiShu);
                }
                index=++i;
            }

            //括号外
            if (flag){
                String substring = string.substring(index, i);
                if (!substring.matches(matche)){
                    if (string.charAt(i-1)>'0'&&string.charAt(i-1)<'9'){
                        in.put(string.substring(index,i-1),string.charAt(i-1)-'0');
                    }else {
                        in.put(string.substring(index,i-1),1);
                    }
                    index=--i;
                }
            }else {
                String substring = string.substring(index, i);
                if (!substring.matches(matche)){
                    if (string.charAt(i-1)>'0'&&string.charAt(i-1)<'9'){
                        hashMap.put(string.substring(index,i-1),string.charAt(i-1)-'0');
                    }else {
                        hashMap.put(string.substring(index,i-1),1);
                    }
                    index=--i;
                }
            }
        }
        if (string.charAt(length-1)>'0'&&string.charAt(length-1)<'9'){
            hashMap.put(string.substring(index,length-1),string.charAt(length-1)-'0');
        }else {
            hashMap.put(string.substring(index,length-1),1);
        }
        hashMap.remove("");
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.print(next.getKey()+next.getValue());
        }
        System.out.println();
    }
}
