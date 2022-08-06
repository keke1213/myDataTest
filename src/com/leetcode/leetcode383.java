package com.leetcode;

import java.util.Arrays;
//bg"
//"efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"
//"fihjjjjei"
//"hjibagacbhadfaefdjaeaebgi"
public class leetcode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("fihjjjjei"
                ,"hjibagacbhadfaefdjaeaebgi"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        char[] chars1 = magazine.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        boolean falg=false;int i=0,j=0;
        while (i<chars.length&&j<chars1.length){
            if (chars[i]==chars1[j])
            {
                falg=true;i++;j++;
            }else{
                falg=false;j++;
            }
        }
        
        return falg;
    }
}
