package Leetcode;

public class Leetcode_ReverseNodeInKgrp {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        ListNode nextGroup = dummy;

        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }

        while (count >= k) {
            head = current.next;
            nextGroup = head.next;

            for (int i = 1; i < k; i++) {
                head.next = nextGroup.next;
                nextGroup.next = current.next;
                current.next = nextGroup;
                nextGroup = head.next;
            }

            current = head;
            count -= k;
        }

        return dummy.next;
    }
}
