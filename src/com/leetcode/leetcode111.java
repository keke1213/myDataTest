package com.leetcode;

public class leetcode111 {
    public static void main(String[] args) {

    }
    public static int minDepth(TreeNode root) {
        if (root==null)return 0;
        if (root.left!=null)return minDepth(root.left)+1;
        if (root.right!=null)return minDepth(root.right)+1;
//        return Math.min()
        return 1;
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
}
