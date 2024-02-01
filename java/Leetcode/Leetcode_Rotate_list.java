package Leetcode;

class Leetcode_Rotate_list {
    public ListNode rotateRight(ListNode head, int k) {
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find the length of the linked list
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Calculate the effective rotation count
        k = k % length;

        // If k is 0, no rotation is needed
        if (k == 0) {
            return head;
        }

        // Find the new tail node
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; ++i) {
            newTail = newTail.next;
        }

        // Update pointers to rotate the list
        ListNode newHead = newTail.next;
        newTail.next = null;
        temp.next = head;

        return newHead;
    }
}

// class Solution {
//     public:
//         ListNode* rotateRight(ListNode* head, int k) {
//             // Check if the linked list is empty or has only one node
//             if (!head || !head->next || k == 0) {
//                 return head; //same list is returned 
//             }
    
//             // Find the length of the linked list
//             int length = 1;
//             ListNode* temp = head;
//             while (temp->next) {
//                 temp = temp->next;
//                 length++;
//             }
    
//             // Calculate the effective rotation count
//             k = k % length;
    
//             // If k is 0, no rotation is needed
//             if (k == 0) {
//                 return head;
//             }
    
//             // Find the new tail node
//             ListNode* newTail = head;
//             for (int i = 0; i < length - k - 1; ++i) {
//                 newTail = newTail->next;
//             }
    
//             // Update pointers to rotate the list
//             ListNode* newHead = newTail->next;
//             newTail->next = nullptr;
//             temp->next = head;
    
//             return newHead;
//         }
//     };
    
