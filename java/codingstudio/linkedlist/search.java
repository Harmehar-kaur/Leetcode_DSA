package codingstudio.linkedlist;


public class search {
    
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node p = head;  
        while (p!=null){
            if(p.data == k){
                return 1;
            }
            p=p.next; 
        }
        return 0; 
    }
}

