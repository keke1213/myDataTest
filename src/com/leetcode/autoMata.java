package com.leetcode;

import java.util.Scanner;

/**
 * @author 莴笋
 * @date 2021/8/22 10:15
 * 自动机
 */
public class autoMata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //用来拼接
        s = autoMata(s);
        System.out.println(s);
    }

    public static String autoMata(String s) {
        String ans = "" + s.charAt(0);
        char ch = s.charAt(0);
        int stat = 0;
        for (int i = 1; i < s.length(); i++) {
            switch (stat) {
                case 0: {
                    if (ch == s.charAt(i)) {
                        stat = 1;
                        break;
                    } else {
                        stat = 0;
                        break;
                    }
                }
                case 1: {
                    if (ch == s.charAt(i)) {
                        continue;
                    } else {
                        stat = 2;
                        break;
                    }
                }
                case 2: {
                    if (ch == s.charAt(i)) {
                        continue;
                    } else {
                        stat = 0;
                        break;
                    }
                }

            }
            ans = ans + s.charAt(i);
            ch = s.charAt(i);
        }
        return ans;
    }

}
