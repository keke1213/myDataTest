package com.guigu;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("请输入学生数量");
        n = sc.nextInt();
        Float[][] sources = new Float[n][5];
        boolean flag = true;
        for (int i = 0; i < n; ) {
            System.out.printf("请输入第%d个学生的学号\n", i + 1);
            float id = Float.valueOf(sc.nextInt());
            sources[i][0] = id;
            for (int k = 0; k < i; k++) {
                if (id == sources[k][0]) {
                    System.out.println("学号重复，请重新输入");
                    flag = false;
                    continue;
                }
                flag = true;
            }
            if (flag) {
                float sum = 0;
                for (int j = 1; j < 4; ) {
                    System.out.printf("请输入第%d个学生的第%d门成绩\n", i + 1, j);
                    float num = sc.nextFloat();
                    if (num < 0 || num > 100) {
                        continue;
                    }
                    sources[i][j] = num;
                    sum += num;
                    j++;
                }
                sources[i][4] = sum / 3;
                i++;
            }
        }
        System.out.println("学号\t成绩1\t成绩2\t成绩3\t平均分");
        for (int i = 0; i < sources.length; i++) {
            System.out.printf("%.0f\t", sources[i][0]);
            for (int j = 1; j < sources[i].length; j++) {
                System.out.printf("%4   .1f\t", sources[i][j]);
            }
            System.out.println();
        }
    }
}
