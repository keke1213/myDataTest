package com.atguigu.linkedlist;

/**
 * 约瑟夫问题 就是单项循环链表
 */
public class Josephu {
    public static void main(String[] args) {
        CircleSingleLinkedList cs = new CircleSingleLinkedList();
        cs.add(5);
//        cs.List();
        cs.count(1, 2, 5);
//        cs.List();
    }
}

//环形链表
class CircleSingleLinkedList {
    private Boy first = null;

    public void add(int num) {
        if (num < 1) {
            System.out.println("输入的数值不正确");
        }
        int i = 1;
        Boy boy = new Boy(i);
        Boy curBoy;
        first = boy;
        boy.setNext(first);
        curBoy = first;
        while (i < num) {
            i++;
            Boy boy1 = new Boy(i);
            boy1.setNext(first);
            curBoy.setNext(boy1);
            curBoy = boy1;

        }
    }

    public void List() {
        Boy temp = first;
        if (temp == null) {
            return;
        }
        while (true) {
            System.out.println(temp);

            if (temp.getNext() == first) break;

            temp = temp.getNext();
        }
    }

    /**
     * @param index 起始的下标
     * @param count 数数的次数
     * @param num   一开始的人数
     */
    public void count(int index, int count, int num) {
        if (first == null || index < 0 || index > num) {
            System.out.println("程序出错");
            return;
        }
        Boy helper = first;
        while (helper.getNext() != first) {
            helper = helper.getNext();
        }
        for (int i = 0; i < index - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while (helper != first) {
            for (int i = 0; i < count - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.print(first.getNo() + "-->");
            helper.setNext(first.getNext());
            first = first.getNext();
        }
        System.out.print(first.getNo());
    }
}

class Boy {
    private int no;
    private Boy next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    public Boy(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }
}