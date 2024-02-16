package Leetcode;

public class Leetcode_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Create a dummy head to simplify the code.
        ListNode current = dummyHead; // Initialize a current node to build the result linked list.
        int carry = 0; // Initialize the carry to 0.

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10); // Create a new node for the result.
            current = current.next; // Move to the next node in the result linked list.

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // If there's a carry after the last addition, add a new node for it.
        }

        return dummyHead.next; // The result linked list starts from the node after the dummy head.
    }
}
