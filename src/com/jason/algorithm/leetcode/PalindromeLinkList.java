package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

/**
 * Created by jsson on 20/6/11.
 */
public class PalindromeLinkList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;
        slow = reverse(slow);

        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
       ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
