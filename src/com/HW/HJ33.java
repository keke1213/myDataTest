package com.HW;

import java.util.Scanner;

public class HJ33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.contains(".")) {

                String[] split = s.split("\\.");
                Long sum = 0l;
                for (String value : split) {
                    int i = Integer.parseInt(value);
                    Long ss = sum << 8;
                    sum = ss + i;
                }
                System.out.println(sum);
            } else {
                Long i = Long.parseLong(s);
                StringBuilder stringBuilder = new StringBuilder();
                while (i > 0) {
                    stringBuilder.insert(0, i % 256 + ".");
                    i = i >> 8;
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                System.out.println(stringBuilder.toString());
            }

        }

    }
}
