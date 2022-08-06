package com.atguigu.stack;

public class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Node no1 = new Node(1);
        Node no2 = new Node(2);
        Node no3 = new Node(3);
        Node no4 = new Node(4);
        stack.push(no1);
        stack.push(no2);
        stack.push(no3);
        stack.push(no4);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
        stack.list();
    }
}

class LinkedStack {
    private Node head = new Node(0);
    private Node button = head, top = head;

    public LinkedStack() {
    }

    public boolean isEmpty() {
        return top == button;
    }

    public void push(Node node) {
        if (head == null) {
            System.out.println("空栈push");
            return;
        }
        top.setNext(node);
        node.setPre(top);
        top = top.getNext();
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("栈空pop");
            return;
        } else {
            top = top.getPre();
            top.setNext(null);
        }
    }

    public void list() {
        Node temp = top;
        while (true) {
            if (temp == button) break;
            System.out.println(temp);
            temp = temp.getPre();
        }
    }
}

class Node {
    private int no;
    private Node pre;
    private Node next;

    public Node getNext() {
        return next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                '}';
    }
}
