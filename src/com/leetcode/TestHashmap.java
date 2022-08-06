package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author 莴笋
 * @date 2021/8/30 20:46
 */
public class TestHashmap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "124");
        System.out.println(hashMap.put(1, "123"));
    }
}
