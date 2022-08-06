package com.HW;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32I {
    public static void main(String[] args) {
        offer32II.TreeNode treeNode0=new offer32II.TreeNode(3);
        offer32II.TreeNode treeNode20=new offer32II.TreeNode(9);
        offer32II.TreeNode treeNode21=new offer32II.TreeNode(20);
        offer32II.TreeNode treeNode30=new offer32II.TreeNode(15);
        offer32II.TreeNode treeNode31=new offer32II.TreeNode(7);
        treeNode0.right=treeNode20;
        treeNode0.left=treeNode21;
        treeNode21.right=treeNode30;
        treeNode21.left=treeNode31;
//        levelOrderI(treeNode0);
        int[] ints = levelOrderI(null);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] levelOrderI(offer32II.TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<offer32II.TreeNode> queue=new LinkedList<>();
        if (root==null){
            return new int[0];
        }
        queue.offer(root);
        while (queue.size()!=0){
            int size = queue.size();
            for (int i=0;i<size;i++){
                offer32II.TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left!=null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
            }
        }
        int[] ins=new int[list.size()];
        for (int i=0;i<list.size();i++){
            ins[i]=list.get(i);
        }

        return ins;
    }
}
