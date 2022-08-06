package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode101 {
    public static void main(String[] args) {
//        TreeNode treeNodeL3=new TreeNode(3,null,null);
//        TreeNode treeNodeR3=new TreeNode(3,null,null);
//        TreeNode treeNodeL2=new TreeNode(2,null,treeNodeL3);
//        TreeNode treeNodeR2=new TreeNode(2,null,treeNodeR3);
//        TreeNode root=new TreeNode(1,treeNodeL2,treeNodeR2);
        TreeNode treeNodeL3=new TreeNode(3,null,null);
        TreeNode treeNodeR3=new TreeNode(3,null,null);
        TreeNode treeNodeR4=new TreeNode(4,null,null);
        TreeNode treeNodeL4=new TreeNode(4,null,null);
        TreeNode treeNodeL2=new TreeNode(2,treeNodeL3,treeNodeR4);
        TreeNode treeNodeR2=new TreeNode(2,treeNodeL4,treeNodeR3);
        TreeNode root=new TreeNode(1,treeNodeL2,treeNodeR2);
        isSymmetric(root);

    }
    //失败
//    public static boolean isSymmetric(TreeNode root) {
//        if (root==null)return false;
//        Queue<TreeNode> queue =new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            StringBuilder sb=new StringBuilder();
//            for (int i=0;i<size;i++)
//            {
//                TreeNode poll = queue.poll();
//                if (poll.val<0)return false;
//                if (poll.left!=null){sb.append(poll.left.val);queue.add(poll.left);}
//                else{sb.append("F");}
//                if (poll.right!=null){sb.append(poll.right.val);queue.add(poll.right);}
//                else{sb.append("F");}
//            }
//            String s=sb.toString();
//            if (!s.equals(sb.reverse().toString()))return false;
//
//        }
//        return true;
//    }
    //没通过
//    public boolean isSymmetric(TreeNode root) {
//        String dfs = dfs(root);
//        StringBuilder s =new StringBuilder(dfs);
//        return dfs.contentEquals(s.reverse());
//    }
//    public static String  dfs(TreeNode root){
//        if (root==null)return "";
//        dfs(root.left);
//        String str=root.val+"";
//        dfs(root.right);
//        return str;
//    }
    public static boolean isSymmetric(TreeNode root) {
        return false;
    }


    public static class TreeNode {
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
