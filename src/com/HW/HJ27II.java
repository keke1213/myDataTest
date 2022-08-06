package com.HW;

import java.util.*;

public class HJ27II {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        String[] str=br.nextLine().split(" ");
        HashSet<String> set =new HashSet<>();
        String word=str[str.length-2];
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        String newWord = Arrays.toString(wordChar);
//        set.add(word);
        ArrayList<String> arrayList=new ArrayList<>();

        for (int i=1;i<str.length-2;i++){
            if (str[i].length()!=word.length())continue;
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String string = Arrays.toString(chars);
            if (newWord.equals(string)&&!word.equals(str[i])){
                arrayList.add(str[i]);
            }
        }
        Collections.sort(arrayList);
        int i = Integer.parseInt(str[str.length - 1]);
        if (i>arrayList.size()){

            System.out.println(arrayList.size());
        }else {
            System.out.println(arrayList.size());

            System.out.println(arrayList.get(i-1));
        }
    }
}
