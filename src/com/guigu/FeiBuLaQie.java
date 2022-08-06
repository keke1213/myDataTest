package com.guigu;

import java.util.Scanner;

public class FeiBuLaQie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数组大小：");
            int size = sc.nextInt();
            if (size <= 2) {
                System.out.println("输入非法，请重新输入");
                continue;
            }
            int[] nums = new int[size];
            nums[0] = 1;
            nums[1] = 1;
            for (int i = 2; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.println("第" + (i + 1) + "个数：" + nums[i]);
            }
            break;
        }
        sc.close();

    }
}
