package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 * Created by jsson on 20/5/24.
 */
public class MergeTwoSortedLists {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }

        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }

    ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        ListNode l1p = l1;
        ListNode l2p = l2;
        while (l1p != null && l2p != null) {
            if (l1p.val < l2p.val) {
                p.next =l1p;
                l1p = l1p.next;
            } else {
                p.next = l2p;
                l2p = l2p.next;
            }

            p = p.next;
        }

        if (l1p != null) {
            p.next = l1p;
        } else {
            p.next = l2p;
        }

        return p.next;
    }
}
