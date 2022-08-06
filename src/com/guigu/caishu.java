package com.guigu;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class caishu {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入一个1-100之间的数");
            num = scanner.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("请重新输入");
            } else if (num > i) {
                System.out.println("输入的数太大了");
            } else if (num < i) {
                System.out.println("输入的数太小了");
            } else {
                System.out.println("猜对了");
                break;
            }

        }
    }
}
