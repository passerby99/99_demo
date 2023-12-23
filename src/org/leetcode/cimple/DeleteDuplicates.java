package org.leetcode.cimple;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DeleteDuplicates {
    private class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        while (head != null){
            hashSet.add(head.val);
            head = head.next;
        }
        ListNode node = new ListNode();

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            ListNode newNode = new ListNode();
            newNode.val = (int) iterator.next();
            if(head == null) {
                head = newNode;
            }
            node.next = newNode;
            node = newNode;

        }
        return head;
    }
}
