package com.leetcode;

public class leetcode83 {
    public static void main(String[] args) {

    }
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)return head;
        ListNode listNode=new ListNode(0);
        listNode.next=head;
        ListNode temp=head;
        while (temp.next!=null){
            if (temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return listNode.next;
    }
}
