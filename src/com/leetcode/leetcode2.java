package com.leetcode;

public class leetcode2 {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int jinwei = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            int num = sum % 10;
            jinwei = sum / 10;
//            ListNode newNode = new ListNode(jinwei);
        }
        return null;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}