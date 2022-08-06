package com.HW;

import com.collection.QunenTest;

import java.util.*;

public class offer32II {
    public static void main(String[] args) {
            TreeNode treeNode0=new TreeNode(3);
            TreeNode treeNode20=new TreeNode(9);
            TreeNode treeNode21=new TreeNode(20);
            TreeNode treeNode30=new TreeNode(15);
            TreeNode treeNode31=new TreeNode(7);
            treeNode0.left=treeNode20;
            treeNode0.right=treeNode21;
            treeNode21.left=treeNode30;
            treeNode21.right=treeNode31;
            levelOrder(treeNode0);
        System.out.println();

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists=new ArrayList<>();
        if (root==null)return lists;
        Queue<TreeNode>  queue=new LinkedList<>();
        queue.offer(root);
        while (queue.size()!=0){
            for (int i=0;i<queue.size();i++){
                ArrayList<Integer> level = new ArrayList<>();
                int size = queue.size();
                for (int j=0;j<size;j++){
                    TreeNode poll = queue.poll();
                    if (poll.left!=null) {
                        queue.offer(poll.left);
                    }
                    if (poll.right!=null){
                        queue.offer(poll.right);
                    }
                    level.add(poll.val);
                }
                lists.add(level);
            }
        }
        return lists;
    }
    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
}
