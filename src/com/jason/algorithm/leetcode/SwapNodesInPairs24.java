package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
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
