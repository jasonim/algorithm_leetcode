package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 * Created by jsson on 20/2/27.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode q = l1, p = l2;
        int carry = 0;
        ListNode perHead = new ListNode(0);
        ListNode cur = perHead;
        while (q != null || p != null) {
            int x = q.val;
            int y = p.val;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            if (q != null) {
                q = q.next;
            }
            if (p != null) {
                p = q.next;
            }
        }

        return perHead.next;
    }


}
