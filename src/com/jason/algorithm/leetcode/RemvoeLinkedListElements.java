package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 * Created by jsson on 20/5/24.
 */
public class RemvoeLinkedListElements {
    ListNode removeElements(ListNode head, int val){
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode cur = prev;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            }else  {
                cur = cur.next;
            }
        }

        return prev.next;

    }
}
