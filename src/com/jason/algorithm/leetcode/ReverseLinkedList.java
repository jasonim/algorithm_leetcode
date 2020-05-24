package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/26.
 *
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */




public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        ListNode cur = head;
        ListNode next;
        while( cur != null) {
            next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
            System.out.println( " priv: " + prev.val + " cur: " + cur.val + " cur->next: " + cur.next.val + " next: " + next.val);
        }

        return cur;

    }

    /**
     * Reverse a linked list from position m to n. Do it in one-pass.

     Note: 1 ≤ m ≤ n ≤ length of list.

     Example:

     Input: 1->2->3->4->5->NULL, m = 2, n = 4
     Output: 1->4->3->2->5->NULL
     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode cur = head;
        while(m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = prev;
        ListNode tail = cur;

        while(n > 0) {
            ListNode thrid = cur.next;

            cur.next = prev;

            prev = cur;
            cur = thrid;
            n--;
        }
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
