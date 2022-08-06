package com.leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class leetcode104 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        int round=0;
        queue.add(root);
        while (!queue.isEmpty()){
            round++;
            int size=queue.size();
            for (int i=0;i<size;i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
        }
        return round;
    }
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
