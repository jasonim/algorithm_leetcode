package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II
 Medium

 1277

 98

 Add to List

 Share
 Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 Example 1:

 Input: 1->2->3->3->4->4->5
 Output: 1->2->5
 Example 2:

 Input: 1->1->1->2->3
 Output: 2->3
 * Created by jsson on 20/2/28.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dumHead = new ListNode(-1);
        dumHead.next = head;
        ListNode cur = dumHead.next;
        ListNode prev = dumHead;

        while (cur != null) {
            ListNode p = cur;
            int num = 0;
            while (p != null && p.val == cur.val) {
                p = p.next;
                num++;
            }

            if (num > 1) {
                prev.next = p;
            } else {
                prev = cur;
            }

            cur = p;
        }


        return dumHead.next;
    }
}
