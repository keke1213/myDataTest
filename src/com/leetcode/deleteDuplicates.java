package com.leetcode;

public class deleteDuplicates {
    public static void main(String[] args) {

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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode tempNext = temp.next;

        while (tempNext != null) {
            if (temp.val == tempNext.val) {
                tempNext = tempNext.next;
            } else {
                temp.next = tempNext;
                temp = tempNext;
                tempNext = temp.next;
            }
        }
        temp.next = null;
        return head;
    }
}
