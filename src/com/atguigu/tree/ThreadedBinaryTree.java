package com.atguigu.tree;

/**
 * @author 莴笋
 * @date 2021/8/15 11:15
 */
public class ThreadedBinaryTree {
}
/**
 * 线索二叉树实现
 * class BinaryTree {
 * private HeroNode root;
 * privateHeroNode pre=null;
 * public void threadNodes() {
 * threadNodes(root);
 * }
 * public void threadNodes(HeroNode node) {
 * if(node==null) {
 * return;
 * }
 * threadNodes(node.getLeft());
 * if(node.getLeft()==null){
 * node.setLeft(pre);
 * node.setLeftType(1);
 * }
 * if(pre!=null&&pre.getRight()==null) {
 * pre.setRight(node);
 * pre.setRightType(1); }
 * pre=node;
 * threadNodes(node.getRight());}}
 */


