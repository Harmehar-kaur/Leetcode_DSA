package Leetcode;

public class Leetcode_RemoveNthFromTheEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node to handle edge cases.
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n+1 nodes ahead.
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both first and second pointers until the first pointer reaches the end.
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end.
        second.next = second.next.next;

        return dummy.next; // Return the modified head (skip the dummy node).
    }
}

