package org.leetcode.cimple;

import java.util.ArrayList;
import java.util.Collections;

// 链表的合并
public class MergeTwoLists {
    public static void run() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//        ListNode list1 = null;
//        ListNode list2 = null;
        ListNode list = mergeTwoLists2(list1, list2);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }

    // 原始版本
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arrayList;

        int size1 = 0;
        int size2 = 0;
        ListNode list3 = list1;
        ListNode list4 = list2;
        while (list3 != null) {
            size1++;
            list3 = list3.next;
        }
        while (list4 != null) {
            size2++;
            list4 = list4.next;
        }
        if (size1 == size2 && size1 == 0) {
            return null;
        }
        if (size1 > size2) {
            arrayList = init(list1, list2);
        } else {
            arrayList = init(list2, list1);
        }
        ListNode list = new ListNode(arrayList.get(arrayList.size() - 1), null);
        for (int i = arrayList.size() - 2; i >= 0; i--) {
            ListNode newNode = new ListNode(arrayList.get(i));
            newNode.next = list;
            list = newNode;
        }
        return list;
    }

    public static ArrayList init(ListNode list1, ListNode list2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (list1 != null) {
            arrayList.add(list1.val);
            if (list2 != null) {
                arrayList.add(list2.val);
                list2 = list2.next;
            }
            list1 = list1.next;
        }
        Collections.sort(arrayList);

        return arrayList;
    }

    // 看题解优化后,使用递归
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
