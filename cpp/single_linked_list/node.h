#include <cstddef>
class Node {
    public: 
        int info; //actual data stored in the list 
        Node *link; //ptr to next node 

        Node(int i){
            info= i; 
            link = NULL; 
        }
}; 