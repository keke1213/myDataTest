package com.leetcode;

public class leetcode13 {
    public static void main(String[] args) {
//        romanToInt("III");
//        romanToInt("IV");
//        romanToInt("IX");
//        romanToInt("LVIII");
        romanToInt("MCMXCIV");
    }
    public static int romanToInt(String s) {
        int sum=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case 'I':sum=sum+1;break;
                case 'V':if (sum<5)sum=5-sum;else sum+=5;break;
                case 'X':if (sum<10)sum=10-sum;else sum+=10;break;
                case 'L':if (sum<50)sum=50-sum;else sum+=50;break;
                case 'C':if (sum<100)sum=100-sum;else sum+=100;break;
                case 'D':if (sum<500)sum=500-sum;else sum+=500;break;
                case 'M':if (sum<1000)sum=1000-sum;else sum+=1000;break;
            }
        }
        return sum;
    }
}
