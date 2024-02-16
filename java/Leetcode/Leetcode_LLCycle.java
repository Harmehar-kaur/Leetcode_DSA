package Leetcode;

public class Leetcode_LLCycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false; // No cycle if the list is empty or has only one node.
            }
            // tortoise or hare also called floyds cycle detection algo
            ListNode tortoise = head;
            ListNode hare = head;

            while (hare != null && hare.next != null) {
                tortoise = tortoise.next; // Move one step.
                hare = hare.next.next; // Move two steps.

                if (tortoise == hare) {
                    return true; // Cycle detected.
                }
            }

            return false; // No cycle found.
        }
    }

}
