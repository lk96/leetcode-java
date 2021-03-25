package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 14:36
 * @Description: 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode listNode2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1 != null || l2 != null) {
            int val = Math.min(
                    (l1 == null ? Integer.MAX_VALUE : l1.val),
                    (l2 == null ? Integer.MAX_VALUE : l2.val)
            );
            curr.next = new ListNode(val);
            curr = curr.next;
            if (l1 != null && l1.val == val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }

    static class ListNode {
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
