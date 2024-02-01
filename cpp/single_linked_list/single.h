// the functions are const because they make no change to the list elements 

#include "cpp\single_linked_list\node.h"
class SingleLinkedList{

    //variables 
    Node *start; //points to first node of the linked list  
    
    //private functions 
    bool isEmpty() const;
    Node* findCycle(); 
    Node* merge1(Node *p1, Node *p2); 
    Node* merge2(Node *p1, Node *p2);
    Node* divideList(Node* p); 
    Node* mergeSortRec(Node* listStart); 

    //member functions 
    public: 
        SingleLinkedList(); //default constructor 
		SingleLinkedList(const SingleLinkedList& L);//copy constructor 
		~SingleLinkedList(); //destructor 
		SingleLinkedList& operator=(const SingleLinkedList& L); //overloads the assignment operator
		void displayList() const;// displays the linked list 
		int countNodes() const; //no of nodes
		int find(int data) const; //search an ele  

        //insertion 
		void insertAtBeginning(int data);
		void insertAtEnd(int data);
		void createList();
		void insertAfter(int data,int x);
		void insertBefore(int data,int x);
		void insertAtPosition(int data,int k);

        //deletion 
		void deleteFirstNode();
		void deleteLastNode();
		void deleteNode(int data);

        //reverse ll 
		void reverseList();

        //sorting the list 
		void insertCycle(int x);
		bool hasCycle();
		void removeCycle();
		void bubbleSortExData();
		void bubbleSortExLinks();
		void mergeLists1(const SingleLinkedList& L, SingleLinkedList& mergeList);
		void mergeLists2(SingleLinkedList& L, SingleLinkedList& mergedList);
		void mergeSort();
}; 