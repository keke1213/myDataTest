package com.leetcode;

import java.util.HashSet;

public class leetcode160 {
    public static void main(String[] args) {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet=new HashSet<>();
        while (headA!=null){
            hashSet.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if (hashSet.contains(headB))return headB;
            headB=headB.next;
        }
        return null;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
