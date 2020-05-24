package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 Hard

 3799

 246

 Add to List

 Share
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

 Example:

 Input:
 [
 1->4->5,
 1->3->4,
 2->6
 ]
 Output: 1->1->2->3->4->4->5->6
 * Created by jsson on 20/2/29.
 */
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(0, new NodeComparator());
        Collections.addAll(queue, lists);

        ListNode head = new ListNode(0);
        ListNode point = head;

        while (!queue.isEmpty()) {
            point.next = queue.poll();
            point = point.next;
            System.out.println(point.val);

            ListNode next = point.next;
            if (next != null) {
                queue.add(next);
            }


        }

        return head.next;
    }

    class NodeComparator implements Comparator<ListNode>{
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }
}
