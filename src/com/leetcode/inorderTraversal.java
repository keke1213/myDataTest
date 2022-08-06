package com.leetcode;


import java.util.ArrayList;
import java.util.List;


public class inorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getValue(root, list);
        return list;
    }

    public static void getValue(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        getValue(root.left, list);
        list.add(root.val);
        getValue(root.right, list);
    }
}
