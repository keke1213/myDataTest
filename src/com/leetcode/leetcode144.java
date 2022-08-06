package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode144 {

    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null){
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    private List<Integer> list=new ArrayList<>();
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
