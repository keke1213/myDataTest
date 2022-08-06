package com.atguigu.tree;

/**
 * @author 莴笋
 * @date 2021/8/14 23:32
 */
public class ArrangeTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrangeTree arrangeTree = new ArrangeTree(arr);
        arrangeTree.preOrder();
    }
}

class ArrangeTree {
    private int[] arr;

    public ArrangeTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder() {
        this.preOrder(0);
    }

    public void preOrder(int index) {
        if (arr == null) {
            System.out.println("数组为空");
            return;
        }
        System.out.print("-->" + arr[index]);
        if ((index * 2 + 1) < arr.length) {
            this.preOrder(index * 2 + 1);
        }
        if ((index * 2 + 2) < arr.length) {
            this.preOrder(index * 2 + 2);
        }
    }
}