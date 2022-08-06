package com.leetcode;

public class leetcode203 {
    public static void main(String[] args) {

    }
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
     public ListNode removeElements(ListNode head, int val) {
         ListNode listNode = new ListNode(0);
         listNode.next=head;
         ListNode temp=listNode;
         while (temp.next!=null){
             if (temp.next.val==val){
                 temp.next=temp.next.next;
             }else {
                 temp=temp.next;
             }
         }
         return listNode.next;
     }
}
