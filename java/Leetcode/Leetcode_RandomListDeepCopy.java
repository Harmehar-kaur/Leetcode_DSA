package Leetcode;

public class Leetcode_RandomListDeepCopy {
    public Node copyRandomList(Node head) {

        if(head == null){
            return null; 
        }

        // deep copy of each node then connect 
        Node p=head; 
        while (p!=null){
            Node copy = new Node(p.val); 
            copy.next=p.next; 
            p.next=copy; 
            p=copy.next; 
        }

        p=head; 

        // setting random pointers
        while(p!=null){
            if(p.random!=null){
                p.next.random=p.random.next; 
            }
            p=p.next.next; 
        }
        
        Node original=head; 
        Node copied =head.next; 
        Node result =copied; 
        while (original!= null){
            original.next=copied.next;
            original =original.next; 
            if(original!=null){
                copied.next=original.next; 
                copied=copied.next; 
            }
        }
        return result; 
    }

}
