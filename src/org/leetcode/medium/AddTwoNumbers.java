package org.leetcode.medium;

public class AddTwoNumbers {
    public static class ListNode {
        public int val;
        public ListNode next;

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

    int number = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode list = listNode;
        if(l1.val == 0 && l1.next == null) {
            return l2;
        }
        if(l2.val == 0 && l2.next == null) {
            return l1;
        }
        while (true) {

            if (l1 == null) {
                if (number == 0) {
                    listNode.next = l2;
                    break;
                }
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                if (number == 0) {
                    listNode.next = l1;
                    break;
                }
                l2 = new ListNode(0);
            }
            ListNode newNode = new ListNode();
            int val = l1.val + l2.val;
            if (val >= 10) {
                newNode.val = val % 10 + number;
                number = 1;
            } else {
                newNode.val = val + number;
                number = 0;
                if(newNode.val >= 10) {
                    newNode.val = newNode.val % 10;
                    number = 1;
                }
            }
            listNode.next = newNode;
            listNode = listNode.next;
            l1 = l1.next;
            l2 = l2.next;

        }
        return list.next;
    }

}
