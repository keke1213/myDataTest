package com.atguigu.tree;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 莴笋
 * @date 2021/8/17 0:17
 * 67
 * 29 38
 * 15 7 8 23
 * 10 4 1 3 6 13
 */
public class HuffmanTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 13, 29};
        Node node = HuffmanTree.createHuffmanTree(arr);
        System.out.println(node);

        System.out.println("前序遍历赫夫曼树~~~");
        node.perOrder();


    }
}

class HuffmanTree {
    public static Node createHuffmanTree(int[] arr) {
        List<Node> nodeArr = new ArrayList<Node>();
        for (int value : arr) {
            nodeArr.add(new Node(value));
        }
        while (nodeArr.size() > 1) {
            Collections.sort(nodeArr);
            Node leftNode = nodeArr.get(0);
            Node rightNode = nodeArr.get(1);
            Node parent = new Node(leftNode.getValue() + rightNode.getValue());
            nodeArr.remove(leftNode);
            nodeArr.remove(rightNode);
            parent.setLeft(leftNode);
            parent.setRight(rightNode);
            nodeArr.add(parent);
        }
        return nodeArr.get(0);
    }
}

class Node implements Comparable<Node> {
    private int value;
    private Node left;
    private Node right;

    public void perOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.perOrder();
        }
        if (this.right != null) {
            this.right.perOrder();
        }

    }

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }
}
