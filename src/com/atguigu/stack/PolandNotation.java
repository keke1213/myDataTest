package com.atguigu.stack;

import java.util.Stack;

/**
 * 逆波兰计算器
 */
public class PolandNotation {
    public static void main(String[] args) {
        String Poland = "3 4 + 5 * 6 - ";//(3+4)×5-6
        char[] character = Poland.toCharArray();
        Stack st = new Stack();
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        for (int i = 0; i < character.length; i++) {
            if (character[i] == ' ') continue;
            if (isOpera(character[i])) {
                //弹出两个数据进行计算
                num1 = (int) st.pop();
                num2 = (int) st.pop();
                result = cal(num1, num2, character[i]);
                st.push(result);
            } else {

                st.push(character[i] - 48);
            }
        }
        System.out.println(st.peek());
    }

    public static boolean isOpera(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int cal(int num1, int num2, int opr) {
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
}
