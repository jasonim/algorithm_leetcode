package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

 

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Created by jsson on 20/5/24.
 */
public class SwapNodesInPairs24 {
    ListNode swapNodes(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;


        while (p.next != null && p.next.next != null) {
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            p.next = node2;
            node2.next = node1;
            node1.next = next;

            p = node1;
        }

        return dummyHead.next;
    }
}
