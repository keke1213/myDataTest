package com.leetcode;

public class leetcode814 {
    public static void main(String[] args) {

    }
    public static TreeNode pruneTree(TreeNode root) {
            if (root==null)return null;
            root.left=pruneTree(root.left);
            root.left=pruneTree(root.right);
            if (root.right==null&&root.left==null&&root.val==0){return null;}
            return root;
    }
    //子节点包含1为T


    public class TreeNode { int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }}
}
