package com.aaroen.algorithm.medium.add_two_numbers;

public class Solution {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node4 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(node1, node4));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode listNode = new ListNode(0);
        ListNode dummyNode = listNode;

        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int total = x + y + carry;

            carry = total / 10;
            dummyNode.next = new ListNode(total % 10);
            dummyNode = dummyNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyNode.next;
    }
}