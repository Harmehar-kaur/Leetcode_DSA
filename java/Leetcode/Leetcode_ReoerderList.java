package Leetcode;

public class Leetcode_ReoerderList {
    public void reorderList(ListNode head) {

        // when the list is either empty or has only one node then the reordering is not required
        if(head==null | head.next==null){
            return; 
        }

        // find the middle of the linked list
        ListNode slow= head, fast=head; 
        while(fast.next!= null && fast.next.next != null){
            slow=slow.next; 
            fast=fast.next.next; 
        }

        // reverse the second half of the list 
        ListNode prev=null, currentHead=slow.next, temp; 
        slow.next=null; 
        while(currentHead!=null){
            temp=currentHead.next; 
            currentHead.next=prev; 
            prev=currentHead; 
            currentHead=temp; 
        }

        //merge the first half and second half now 

        ListNode firstHead=head, secondHead= prev;
        while(secondHead!=null){
            temp=firstHead.next; 
            firstHead.next= secondHead; 
            secondHead=secondHead.next; 
            firstHead.next.next = temp; 
            firstHead=temp; 
        } 
    }
}
