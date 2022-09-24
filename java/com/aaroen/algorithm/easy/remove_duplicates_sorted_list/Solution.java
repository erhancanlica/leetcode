package com.aaroen.algorithm.easy.remove_duplicates_sorted_list;

public class Solution {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(1, node);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode res = deleteDuplicates(node);

        System.out.println(res);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;

    }
}

class ListNode {
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
