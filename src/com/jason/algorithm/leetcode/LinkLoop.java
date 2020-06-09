package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.ListNode;

import java.util.HashMap;

/**
 * Created by jsson on 20/6/9.
 */
public class LinkLoop {

    public static boolean hasLoop(ListNode head){
        if(head == null)
            return false;

        if(head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != slow){
            if(fast.next == null)
                return false;
            if(fast.next.next == null)
                return false;

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }

//    //方法2：将每次走过的节点保存到hash表中，如果节点在hash表中，则表示存在环
//    public static boolean hasLoop2(ListNode n){
//        ListNode temp1 = n;
//        HashMap<ListNode,ListNode> ns = new HashMap<ListNode,ListNode>();
//        while(n!=null){
//            if(ns.get(temp1)!=null)return true;
//            else ns.put(temp1, temp1);
//            temp1 = temp1.next;
//            if(temp1 == null)return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;  //构造一个带环的链表,去除此句表示不带环

        System.out.println(hasLoop(n1));
//        System.out.println(hasLoop2(n1));
    }
}
