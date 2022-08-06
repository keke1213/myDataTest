package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class leetcode145 {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list=new LinkedList<>();
            dfs(root,list);
            return list;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root==null)return;
        dfs(root.left,list);
        dfs(root.right,list);
        list.add(root.val);
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
