package com.FanXin;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(true);
        while (true) {
            System.out.println("请输入班级和性别");
            int classNumber = scanner.nextInt();
            if (classNumber != 2110) {
                System.out.println("请回家");
                return;
            }
            char sex = scanner.next().charAt(0);
            if (sex == '男') {
                System.out.println("你扫地");
            } else if (sex == '女') {
                System.out.println("你擦窗户");
            } else {
                System.out.println("输入错误");
            }
        }

    }
}
