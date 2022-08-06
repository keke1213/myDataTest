package com.HW;

import java.util.*;

public class leetCode0808 {
    public static void main(String[] args) {

}
    public static String[] permutation(String S) {
        StringBuilder stringBuilder=new StringBuilder();
        HashSet<String> hashSet=new HashSet<>();
        String[] split = S.split("");
        int length = split.length;
        int index=0;
        dfs(split,index,length,hashSet);
        return null;
    }

    private static void dfs(String[] split, int index, int length, HashSet<String> hashSet) {



    }
}
