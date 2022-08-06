package com.atguigu.stack;

import java.util.Date;

public class ArrangeStackDemo {

    public static void main(String[] args) {
        ArrangeStack stack = new ArrangeStack(3);
        stack.push(12.4F);
        stack.push("RenChao");
        stack.push(new Date());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.List();
//

    }
}

class ArrangeStack {
    private int top = -1;
    private int button = -1;
    private Object[] ary;
    private int MaxSize;

    public ArrangeStack(int maxSize) {
        MaxSize = maxSize;
        ary = new Object[maxSize];
    }

    public boolean isFull() {
        return top == MaxSize - 1;
    }

    public boolean isEmpty() {
        return top == button;
    }

    public void push(Object item) {
        if (isFull()) {
            throw new RuntimeException("栈空");
        }
        top++;
        ary[top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object item = ary[top];
        top--;
        return item;
    }

    public void List() {
        for (int i = top; i >= 0; i--) {
            System.out.println(ary[i]);
        }
    }
}
