package DSA.SingleLinkedList;

public class SingleLinkedList {

    Node<Integer> head; 

    public boolean isEmpty(){
        return head == null; 
    }

    //traversal of the linked list 
    public void print(Node<Integer> head){
        Node<Integer> temp=head; 
        while(head!= null){
            System.out.println(temp.data+"->");
            temp=temp.next;  
        }
        System.out.println(); 
    }

    //insertion 
    public Node<Integer> insertAtBeginning(Node<Integer> head, int data){
        Node<Integer> temp= new Node<>(data); 
        temp.next=head; 
        head=temp; 
        return head; 

    }

    public Node<Integer> insertAtEnd(Node<Integer> head, int data){
        Node<Integer> temp= new Node<>(data);
        
        if(head==null){
            head=temp; 
            return head; 
        }

        Node<Integer> p = head; 
        while(p.next != null){
            p=p.next; 
        }
        p.next=temp;  
        return head; 

    }
    
    public Node<Integer> insertAtIndex(Node<Integer> head, int data, int index){
        
        if(index==1){
            insertAtBeginning(head, data); 
        }
        int i=1; 
        Node<Integer> p =head;
        while(i<index-1 &&  p != null){
            p=p.next; 
            i++; 
        } 
        if(p==null){
            System.out.println("Index out of bound");
        }
        else{
            Node<Integer> temp= new Node<>(data); 
            temp.next=p.next; 
            p.next=temp;  
        }
        return head;
    }


    //deletion code
    public Node<Integer> deleteFirstNode(){
        if(isEmpty()){
            return null; 
        }
        head=head.next; 
        return head; 
    }

    public void  deleteLast(){
        if(isEmpty()){
            return ; 
        }
        if(head.next==null){
            head=null;
            return ;  
        }
        Node<Integer> p = head; 
        while (p.next.next!= null){
            p=p.next; 
        }
        p.next=null;  

    }

    public void deleteAtParticular(int x){
        if(isEmpty()){
            return; 
        }
        if(head.data==x){ 
            head=head.next; 
            return ; 
        }
        Node<Integer> p=head; 
        while(p.next != null){
            if(p.next.data==x){
                break; 
            }
            p=p.next; 
        }
        if(p.next==null){
            System.out.println("Element"+x+"is not present in the list.");
        }
        else{
            p.next=null;
        }
    }
}
