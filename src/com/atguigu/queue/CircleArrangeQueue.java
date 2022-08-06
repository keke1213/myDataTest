package com.atguigu.queue;


import java.util.Scanner;

/**
 * 循环队列
 * 4个方法：入队 出队 判断是否为空 获取剩余容量
 */
public class CircleArrangeQueue {
    private int maxSize;
    private int front;
    private int real;
    private int[] ary;

    public static void main(String[] args) {


        //测试一把
        System.out.println("测试数组模拟环形队列的案例~~~");

        // 创建一个环形队列
        CircleArrangeQueue queue = new CircleArrangeQueue(4); //说明设置4, 其队列的有效数据最大是3
        char key = ' '; // 接收用户输入
        Scanner scanner = new Scanner(System.in);//
        boolean loop = true;
        // 输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);// 接收一个字符
            switch (key) {
                case 's':
                    queue.show();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g': // 取出数据
                    try {
                        int res = queue.quQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h': // 查看队列头的数据
                    try {
//                        int res = queue.headQueue();
//                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e': // 退出
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~");
    }


    public CircleArrangeQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.real = 0;
        this.ary = new int[this.maxSize];
    }

    public boolean isFull() {
        return (real + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return real == front;
    }

    public int remaining() {
        return (real + maxSize - front) % maxSize;
    }

    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("队列已经满了");
            return;
        }
        ary[real] = data;
        real = (real + 1) % maxSize;
    }

    public int quQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int shuJu = ary[front];
        front = (front + 1) % maxSize;

        return shuJu;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = front; i < front + remaining(); i++) {
            System.out.println("第" + i % maxSize + "个元素的值" + ary[i % maxSize]);
        }
//        int i=0;
//        while (i++<remaining())
//        {
//            System.out.println("第"+i%maxSize+"个元素的值"+ary[i%maxSize]);
//        }
    }

}
