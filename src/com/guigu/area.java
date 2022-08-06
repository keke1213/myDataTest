package com.guigu;

public class area {
    final static float PI = 3.14f;
    static int anInt = 2;
    static int bnInt = 4;

    public static void main(String[] args) {
        int r = 2;
        System.out.println(area(r));
        swap(anInt, bnInt);
        System.out.printf("a=%d,b=%d", anInt, bnInt);
    }

    public static float area(int r) {
        return PI * r * r;
    }

    public static void swap(int a, int b) {
        anInt = anInt ^ bnInt;
        bnInt = anInt ^ bnInt;
        anInt = anInt ^ bnInt;
    }

    /**
     * 将数组b赋给数组a
     *
     * @param a
     * @param b
     */
    public static void Copy(int[] a, int[] b) {
        if (a == null || b == null) {
            System.out.println("数组有错");
            return;
        }
        if (a.length < b.length) {
            System.out.println("数组长度不够");
            return;
        }
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

    }

}
