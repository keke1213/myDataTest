package com.leetcode;

import com.collection.QunenTest;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode226翻转二叉树 {
    public static void main(String[] args) {

    }
    //完全二叉树插入器
    class CBTInserter {
        private TreeNode root;
        public CBTInserter(TreeNode root) {
            this.root=root;
        }

        public int insert(int val) {
            TreeNode temp=get_root();
            Queue<TreeNode>  queue=new LinkedList<>();
            queue.add(temp);
           while (!queue.isEmpty()){
               int size = queue.size();
               TreeNode poll = queue.poll();
               for (int i=0;i<size;i++){
                   if (poll.left==null){
                       poll.left=new TreeNode(val);
                       return poll.val;
                   }else if(poll.right==null){
                       poll.right=new TreeNode(val);
                       return poll.val;
                   }else {
                       queue.offer(poll.left);
                       queue.offer(poll.right);
                   }
               }

           }
           return temp.val;
        }

        public TreeNode get_root() {
            return this.root;
        }
    }
    //插入操作
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null)return null;
        if(root.left==null&&root.right==null){
            if (root.val>val){
                TreeNode treeNode=new TreeNode(val);
                root.left=treeNode;
            }else {
                TreeNode treeNode=new TreeNode(val);
                root.right=treeNode;
            }
        }else {
            if (root.val>val){
                insertIntoBST(root.left,val);
            }else {
                insertIntoBST(root.right,val);
            }
        }

        return root;
    }
    //搜索
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        if (root.val==val)return root;
        return searchBST(root.val>val?root.right: root.left,val);
    }
    //翻转
    public TreeNode invertTree(TreeNode root) {
        if (root==null)return null;
        if (root.left==null&&root.right==null)return root;
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
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
