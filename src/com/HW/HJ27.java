package com.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HJ27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] stringsData = data.split(" ");
        int n=Integer.parseInt(stringsData[0]); //数量
        String word=stringsData[stringsData.length-2];//兄弟单词
        int k =Integer.parseInt(stringsData[stringsData.length-1]);//抽取字典第k个
        String[] strings= new String[n];
        ArrayList<String> arrays =new ArrayList<>();
            for (int i=1;i<stringsData.length-2;i++){
                strings[i-1]=stringsData[i];//数据
            }
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String valueOf = String.valueOf(wordChar);
            int length = word.length();
            for (int i=0;i<n;i++)
            {
                if (strings[i].length()==length){
                    char[] toCharArray = strings[i].toCharArray();
                    Arrays.sort(toCharArray);
                    String valueOf1 = String.valueOf(toCharArray);
                    if (valueOf.equals(valueOf1)){
                        arrays.add(strings[i]);
                    }
                }
            }
            while (arrays.remove(word)){

            }
            Collections.sort(arrays);
            int size = arrays.size();
            if (size!=0){
                    if(size>k-1){
                        System.out.println(arrays.size());
                        System.out.println(arrays.get(k-1));
                    }else {
                        System.out.println(arrays.size());
                    }

                }else {
                System.out.println(0);
            }

        }


}
