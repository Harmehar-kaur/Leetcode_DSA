package Leetcode;
public class Leetcode_ReverseList {
  /**
 * Definition for singly-linked list.
 * 
 */
    public ListNode reverseList(ListNode head) {
        ListNode prev, p, link;
        prev = null;
        p = head;
        while( p != null )
        {
            link = p.next;
            p.next = prev;
            prev = p;
            p = link;
        }
        head = prev;
        return head; 
    }
}  

