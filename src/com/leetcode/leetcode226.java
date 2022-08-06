package com.leetcode;

public class leetcode226 {
    public static void main(String[] args) {

    }
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    public TreeNode invertTree(TreeNode root) {
        if (root==null)return null;
        if (root.left==null&&root.right==null)return root;
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
}
