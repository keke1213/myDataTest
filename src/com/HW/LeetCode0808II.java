package com.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class LeetCode0808II {
    public static void main(String[] args) {
        permutation("qqe");
    }
    public static String[] permutation(String S) {
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        boolean[] status=new boolean[chars.length];
        StringBuilder sb=new StringBuilder();
        TreeSet<String> treeSet=new TreeSet<>();
        dfs(chars,status,sb,treeSet);
        int size = treeSet.size();
        String[] str=new String[size];
        treeSet.toArray(str);
        return str;
    }

    private static void dfs(char[] chars, boolean[] status, StringBuilder sb, TreeSet<String> treeSet) {
        if (sb.length()==chars.length){
            treeSet.add(sb.toString());
            return;
        }
        for (int i=0;i<chars.length;i++){
            if (status[i]||i!=0&&status[i-1]&&chars[i]==chars[i-1]){
                continue;
            }
            sb.append(chars[i]);

            status[i]=true;

            dfs(chars,status,sb,treeSet);

            sb.deleteCharAt(sb.length()-1);

            status[i]=false;

        }

    }
}
