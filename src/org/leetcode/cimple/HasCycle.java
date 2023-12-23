package org.leetcode.cimple;

import org.leetcode.utils.ListNode;

import java.util.ArrayList;

// 环形链表
public class HasCycle {
    ArrayList<ListNode> list = new ArrayList<>();
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (list.contains(head)) {
            return true;
        } else {
            list.add(head);
        }
        return hasCycle(head.next);
    }
}
