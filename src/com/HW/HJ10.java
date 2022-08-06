package com.HW;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] split = s.nextLine().split("");
        HashSet<String> hashSet = new HashSet();
        for (String string:split
             ) {
            hashSet.add(string);
        }
        System.out.println(hashSet.size());

    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    //总共有128个字符。字需要用128位
        BitSet bitSet = new BitSet(128);
            for (char c : line.toCharArray()) {
        //判断字符c是否已出现
        if (!bitSet.get(c)) {
            //未出现就设置为已出现
            bitSet.set(c);
        }
    }
    //统计有多少字符已出现过
            System.out.println(bitSet.cardinality());
    }
//
}
