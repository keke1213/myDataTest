package com.HW;

import java.util.*;

public class offer32III {
    public static void main(String[] args) {
        TreeNode treeNode0= new TreeNode(3);
        TreeNode treeNode20= new TreeNode(9);
        TreeNode treeNode21= new TreeNode(20);
        TreeNode treeNode30= new TreeNode(15);
        TreeNode treeNode31= new TreeNode(7);
        treeNode0.left=treeNode20;
        treeNode0.right=treeNode21;
        treeNode21.left=treeNode30;
        treeNode21.right=treeNode31;
        levelOrderIII(treeNode0);
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(13);
        integers.add(4);
        System.out.println(integers.toString());
        Collections.reverse(integers);
        System.out.println(integers.toString());
    }

    private static List<List<Integer>> levelOrderIII(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if (root==null)return lists;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int count=0;
        while (queue.size()!=0){
            for (int i=0;i<queue.size();i++){
                ArrayList<Integer> level = new ArrayList<>();
                count++;
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
                if (count%2==0){
                    Collections.reverse(level);
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
