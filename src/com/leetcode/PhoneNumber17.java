package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2"));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if (digits.length()==0){
            return result;
        }
        Map<Character,String > keyBos= new HashMap<>();
        keyBos.put('2', "abc");
        keyBos.put('3', "def");
        keyBos.put('4', "ghi");
        keyBos.put('5', "jkl");
        keyBos.put('6', "mno");
        keyBos.put('7', "pqrs");
        keyBos.put('8', "tuv");
        keyBos.put('9', "wxyz");
        dfs(result,keyBos,digits,0,new StringBuffer());
        return result;
    }
    public static List<String> dfs(List<String> result, Map<Character, String> keyBos, String digits, int index, StringBuffer stringBuffer){
        if(index==digits.length()){
            result.add(String.valueOf(stringBuffer));
            return result;
        }else {
            for (int i1=0;i1<keyBos.get(digits.charAt(index)).length();i1++){
                dfs(result,keyBos,digits,index+1,stringBuffer.append(keyBos.get(digits.charAt(index)).charAt(i1)));
                stringBuffer.deleteCharAt(index);
            }
        }
        return result;
    }
}
