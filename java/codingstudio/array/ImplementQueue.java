package codingstudio.array;

public class ImplementQueue {
    
    Node<Integer> front; 
    Node<Integer> rear; 
    ImplementQueue() {
        // Implement the Constructor

        front = null; 
        rear=null; 
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(front==null){
            return true; 
        }
        else{
            return false; 
        }
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        Node<Integer> tempNode = new Node<>(data); 
        if(rear==null){
            rear= tempNode; 
            rear=rear.next; 
        }
    }

    int dequeue() {
        // Implement the dequeue() function
        if(front==null){
            return -1; 
        }
        else{
            int ans = front.data; 
            if(front.next==null){
                front=rear=null; 
                return ans; 
            }
            front = front.next; 
            return ans; 
        }
    }

    int front() {
        // Implement the front() function
        if(front==null){
            return -1; 
        }else{
            return front.data; 
        }
    }

}

    

