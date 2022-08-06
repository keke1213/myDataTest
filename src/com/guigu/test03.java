package com.guigu;

import java.util.Arrays;
import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入学生的数量");
        num = scanner.nextInt();
        float[] source = new float[num];
        float temp;
        float sum = 0;
        for (int i = 0; i < source.length; ) {
            System.out.println("输入学生的分数");
            temp = scanner.nextFloat();
            if (temp > 100 || temp < 0) {
                System.out.println("分数不合法，重新输入");
            } else {
                source[i++] = temp;
                sum += temp;
            }
        }
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length; j++) {

            }
        }

        System.out.printf("最小值%d", source[0]);
        System.out.printf("最大值%d", source[source.length - 1]);
        System.out.printf("平均值%d", sum / source.length);

    }
}
