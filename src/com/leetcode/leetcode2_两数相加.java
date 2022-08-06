package com.leetcode;

public class leetcode2_两数相加 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jin=0;
        int val=0;
        ListNode listNode=new ListNode(0);
        ListNode pre=listNode;
        while (l1!=null&&l2!=null){
            if (l1==null){
                val=(l2.val+jin)%10;
                jin=(l1.val+l2.val+jin)/10;
                ListNode newNode=new ListNode(val);
                listNode.next=newNode;
                listNode=listNode.next;
                l2=l2.next;
                continue;
            }
            if (l2==null){
                val=(l1.val+jin)%10;
                jin=(l1.val+l2.val+jin)/10;
                ListNode newNode=new ListNode(val);
                listNode.next=newNode;
                listNode=listNode.next;
                l1=l1.next;
                continue;
            }
            val=(l1.val+l2.val+jin)%10;
            jin=(l1.val+l2.val+jin)/10;
            ListNode newNode=new ListNode(val);
            listNode.next=newNode;
            listNode=listNode.next;
            l1=l1.next;
            l2=l2.next;
        }
        if (jin!=0){
            ListNode newNode=new ListNode(jin);
            listNode.next=newNode;
        }
        return pre.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
