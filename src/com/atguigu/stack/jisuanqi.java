package com.atguigu.stack;

public class jisuanqi {
    public static void main(String[] args) {
        String item = "3-3*2+8";

        char[] array = item.toCharArray();
        ArrangeStack1 numStack = new ArrangeStack1(9);
        ArrangeStack1 operStack = new ArrangeStack1(9);
        String num = "";
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int opr = 0;
        for (int i = 0; i < array.length; i++) {
            if (operStack.isOper(array[i])) {//如果不是运算符入数栈
                if (!operStack.isEmpty()) {
                    if (operStack.priorty(array[i]) <= operStack.priorty(operStack.getTop())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        opr = operStack.pop();
                        result = numStack.cal(num1, num2, opr);
                        numStack.push(result);
                        operStack.push(array[i]);
                    } else {
                        operStack.push(array[i]);
                    }
                } else {
                    operStack.push(array[i]);
                }
            } else {
                num += array[i];
                if (i == array.length - 1) {
                    numStack.push(Integer.parseInt(num));
                    num = "";
                    break;
                }
                if (operStack.isOper(array[i + 1])) {
                    numStack.push(Integer.parseInt(num));
                    num = "";
                }
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }

            num1 = numStack.pop();
            num2 = numStack.pop();
            opr = operStack.pop();
            result = numStack.cal(num1, num2, opr);
            numStack.push(result);

        }
        System.out.println(numStack.getTop());

    }
}

class ArrangeStack1 {
    private int top = -1;
    private int button = -1;
    private int[] ary;
    private int MaxSize;

    public ArrangeStack1(int maxSize) {
        MaxSize = maxSize;
        ary = new int[maxSize];
    }

    public int cal(int num1, int num2, int opr) {
        int result = 0;
        switch (opr) {
            case '+':
                result = num2 + num1;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num2 * num1;
                break;
            case '/':
                result = num2 / num1;
                break;
            default:
                break;
        }
        return result;
    }

    //判断是否是运算符opera
    public boolean isOper(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    //判断运算符优先级
    public int priorty(int ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    //获取栈顶元素
    public int getTop() {
        return ary[top];
    }

    public boolean isFull() {
        return top == MaxSize - 1;
    }

    public boolean isEmpty() {
        return top == button;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("栈空");
        }
        top++;
        ary[top] = item;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        Integer item = ary[top];
        top--;
        return item;
    }

    public void List() {
        for (int i = top; i >= 0; i--) {
            System.out.println(ary[i]);
        }
    }
}