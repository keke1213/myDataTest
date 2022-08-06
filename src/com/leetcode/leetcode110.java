package com.leetcode;

public class leetcode110 {
    public static void main(String[] args) {

    }
    public static boolean isBalanced(TreeNode root) {
        if (root==null)return true;
        int left=high(root);
        return left <= 1;
    }
    public  static int high(TreeNode treeNode){
        if (treeNode==null)return 0;
        int left,right;
//        return Math.max(left-right);
        return 0;
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
