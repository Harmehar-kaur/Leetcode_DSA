// the functions are const because they make no change to the list elements
#include <iostream>
#include "cpp\single_linked_list\node.h"

using namespace std;

class SingleLinkedList
{

	// variables
	Node *head; // points to first node of the linked list

	// private functions
	bool isEmpty() const
	{
		return head == NULL;
	}

	Node *findCycle()
	{
		if (head  == NULL || head ->link == NULL)
			return NULL;

		Node *slowP = head ;
		Node *fastP = head ;

		while (fastP != NULL && fastP->link != NULL)
		{
			slowP = slowP->link;
			fastP = fastP->link->link;
			if (slowP == fastP)
				return slowP;
		}
		return NULL;
	}

	Node *merge1(Node *p1, Node *p2)
	{
		Node *headM;

		if (p1->info <= p2->info)
		{
			headM = new Node(p1->info);
			p1 = p1->link;
		}
		else
		{
			headM = new Node(p2->info);
			p2 = p2->link;
		}

		Node *pM = headM;

		while (p1 != NULL && p2 != NULL)
		{
			if (p1->info <= p2->info)
			{
				pM->link = new Node(p1->info);
				p1 = p1->link;
			}
			else
			{
				pM->link = new Node(p2->info);
				p2 = p2->link;
			}
			pM = pM->link;
		}

		/*If second list has finished and elements left in first list*/
		while (p1 != NULL)
		{
			pM->link = new Node(p1->info);
			p1 = p1->link;
			pM = pM->link;
		}

		/*If first list has finished and elements left in second list*/
		while (p2 != NULL)
		{
			pM->link = new Node(p2->info);
			p2 = p2->link;
			pM = pM->link;
		}
		return headM;
	}

	Node *merge2(Node *p1, Node *p2)
	{
		Node *headM;

		if (p1->info <= p2->info)
		{
			headM = p1;
			p1 = p1->link;
		}
		else
		{
			headM = p2;
			p2 = p2->link;
		}

		Node *pM = headM;

		while (p1 != NULL && p2 != NULL)
		{
			if (p1->info <= p2->info)
			{
				pM->link = p1;
				pM = pM->link;
				p1 = p1->link;
			}
			else
			{
				pM->link = p2;
				pM = pM->link;
				p2 = p2->link;
			}
		}

		if (p1 == NULL)
			pM->link = p2;
		else
			pM->link = p1;

		return headM;
	}

	Node *divideList(Node *p)
	{
		Node *q = p->link->link;
		while (q != NULL && q->link != NULL)
		{
			p = p->link;
			q = q->link->link;
		}
		Node *head2 = p->link;
		p->link = NULL;
		return head2;
	}

	Node *mergeSortRec(Node *listhead)
	{
		if (listhead  == NULL || listhead ->link == NULL) /*if list empty or has one element*/
			return listhead ;

		/*if more than one element*/
		Node *head1 = listhead ;
		Node *head2 = divideList(listhead );
		head1 = mergeSortRec(head1);
		head2 = mergeSortRec(head2);
		Node *headM = merge2(head1, head2);
		return headM;
	}

	// member functions
public:
	// default constructor
	SingleLinkedList()
	{
		head = NULL;
	}

	// copy constructor (built a list for us from an existing list L)
	SingleLinkedList(const SingleLinkedList &L)
	{
		if (L.head == NULL)
		{
			head = NULL;
			return;
		}

		// p1 traverses the original list L p2 builts a new list
		Node *p1, *p2;
		p1 = L.head;
		p2 = head = new Node(p1->info);
		p1 = p1->link;

		while (p1 != NULL)
		{
			p2->link = new Node(p1->info);
			p2 = p2->link;
			p1 = p1->link;
		}
	}

	// destructor
	~SingleLinkedList()
	{
		Node *p;
		while (head != NULL)
		{
			p = head->link;
			delete head;
			head = p;
		}
	}

	// overloads the assignment operator
	SingleLinkedList &operator=(const SingleLinkedList &L)
	{
		if (this == &L)
			return *this;

		Node *p;
		while (head != NULL)
		{
			p = head->link;
			delete head;
			head = p;
		}

		if (L.head == NULL)
		{
			head = NULL;
			return *this;
		}

		Node *p1, *p2;

		p1 = L.head;
		p2 = head = new Node(p1->info);
		p1 = p1->link;

		while (p1 != NULL)
		{
			p2->link = new Node(p1->info);
			p2 = p2->link;
			p1 = p1->link;
		}
		return *this;
	}

	// traversal
	void displayList() const
	{
		// displays the linked list

		// when the list is empty
		if (isEmpty())
		{
			cout << "List is empty\n";
			return;
		}

		// when the if loop doesn't run this runs
		cout << "List is :\n";
		Node *p = head;
		while (p != NULL)
		{
			// print the element of the single linked list
			cout << p->info << "  ";

			// increment the pointer
			p = p->link;
		}
		cout << "\n\n";
	}

	int countNodes() const
	{
		// returns no of nodes
		Node *p = head;
		int n = 0;
		while (p != NULL)
		{
			n++;
			p = p->link;
		}
		return n;
	}

	// search
	int find(int data) const
	{
		Node *p = head;
		int position = 1; // position variable to find the position of the element
		while (p != NULL)
		{
			if (p->info == data)
			{
				return position;
			}
			position++;
			p = p->link;
		}
		return 0;
	}
	
	// insertion
	void insertAtBeginning(int data)
	{
		Node *temp = new Node(data);
		temp->link = head;
		head = temp;
	}

	void insertAtEnd(int data)
	{
		if (isEmpty())
		{
			insertAtBeginning(data);
			return;
		}
		Node *temp = new Node(data);
		Node *p = head;
		while (p->link != NULL)
		{
			p = p->link;
		}
		p->link = temp;
	}

	void createList()
	{
		int i, n, data;

		cout << "Enter the number of nodes : ";
		cin >> n;

		if (n <= 0)
			return;

		cout << "Enter the first element to be inserted : ";
		cin >> data;
		insertAtBeginning(data);

		Node *p = head;
		for (i = 2; i <= n; i++)
		{
			cout << "Enter the next element to be inserted : ";
			cin >> data;
			Node *temp = new Node(data);
			p->link = temp; // link points to the new node
			p = temp;		// new node is where the pointer is pointing now
		}
	}

	void insertAfter(int data, int x)
	{
		Node *p = head;

		// finding pointer to node with value x
		while (p != NULL)
		{
			if (p->info == x)
				break;
			p = p->link;
		}

		if (p == NULL)
			cout << x << " not present in the list\n";
		else
		{
			Node *temp = new Node(data);
			temp->link = p->link;
			p->link = temp;
		}
	}

	void insertBefore(int data, int x)
	{
		if (isEmpty())
		{
			cout << "List is empty\n";
			return;
		}

		/* x is in first node, new node is to be inserted before first node */
		if (x == head->info)
		{
			Node *temp = new Node(data);
			temp->link = head;
			head = temp;
			return;
		}

		/* Find pointer to predecessor of node containing x */
		Node *p = head;
		while (p->link != NULL)
		{
			if (p->link->info == x)
				break;
			p = p->link;
		}
		if (p->link == NULL)
			cout << x << " not present in the list\n";
		else
		{
			Node *temp = new Node(data);
			temp->link = p->link;
			p->link = temp;
		}
	}

	void insertAtPosition(int data, int k)
	{
		Node *temp;
		if (k == 1)
		{
			temp = new Node(data);
			temp->link = head;
			head = temp;
			return;
		}
		Node *p = head;
		int i;
		for (i = 1; i < k - 1 && p != NULL; i++) /* Find a pointer to (k-1)th node */
			p = p->link;

		if (p == NULL)
			cout << "You can insert only upto " << i << "th position\n";
		else
		{
			temp = new Node(data);
			temp->link = p->link;
			p->link = temp;
		}
	}

	// deletion
	void deleteFirstNode()
	{
		if (isEmpty())
			return;

		Node *temp = head;
		head = head->link;
		delete temp;
	}

	void deleteLastNode()
	{
		if (isEmpty())
			return;

		if (head->link == NULL)
		{
			delete head;
			head = NULL;
			return;
		}

		Node *p = head;
		while (p->link->link != NULL)
			p = p->link;

		delete p->link;
		p->link = NULL;
	}

	void deleteNode(int data)
	{
		if (isEmpty())
		{
			cout << "List is empty\n";
			return;
		}

		Node *temp;

		/* Deletion of first node */
		if (head->info == data)
		{
			temp = head;
			head = head->link;
			delete temp;
			return;
		}

		/* Deletion in between or at the end */
		Node *p = head;
		while (p->link != NULL)
		{
			if (p->link->info == data)
				break;
			p = p->link;
		}

		if (p->link == NULL)
			cout << "Element " << data << " not present in the list\n";
		else
		{
			temp = p->link;
			p->link = temp->link;
			delete temp;
		}
	}

	// reverse ll
	void reverseList()
	{
		Node *prev, *p, *next;
		prev = NULL;
		p = head ;
		while (p != NULL)
		{
			next = p->link;
			p->link = prev;
			prev = p;
			p = next;
		}
		head  = prev;
	}

	// sorting the list
	void insertCycle(int x)
	{
		if (head  == NULL)
			return;

		Node *p = head , *px = NULL, *prev = NULL;

		while (p != NULL)
		{
			if (p->info == x)
				px = p;
			prev = p;
			p = p->link;
		}
		if (px != NULL)
			prev->link = px;
		else
			cout << x << " not present in list"
				 << "\n";
	}

	bool hasCycle()
	{
		if (findCycle() == NULL)
			return false;
		else
			return true;
	}

	void removeCycle()
	{
		Node *c = findCycle();

		if (c == NULL)
			return;

		cout << "Node at which the cycle was detected is " << c->info << "\n";

		Node *p = c, *q = c;
		int lenCycle = 0;
		do
		{
			lenCycle++;
			q = q->link;
		} while (p != q);
		cout << "Length of cycle is : " << lenCycle << "\n";

		int lenRemList = 0;
		p = head ;
		while (p != q)
		{
			lenRemList++;
			p = p->link;
			q = q->link;
		}

		cout << "Number of nodes not included in the cycle are : " << lenRemList << "\n";

		int lengthList = lenCycle + lenRemList;
		cout << "Length of the list is : " << lengthList << "\n";

		p = head ;
		for (int i = 1; i <= lengthList - 1; i++)
			p = p->link;
		p->link = NULL;

		cout << "Cycle removed from the list \n\n";
	}

	void bubbleSortExData()
	{
		Node *end, *p, *q;

		for (end = NULL; end != head ->link; end = p)
		{
			for (p = head ; p->link != end; p = p->link)
			{
				q = p->link;
				if (p->info > q->info)
				{
					int temp = p->info;
					p->info = q->info;
					q->info = temp;
				}
			}
		}
	}

	void bubbleSortExLinks()
	{
		Node *end, *r, *p, *q, *temp;

		for (end = NULL; end != head ->link; end = p)
		{
			for (r = p = head ; p->link != end; r = p, p = p->link)
			{
				q = p->link;
				if (p->info > q->info)
				{
					p->link = q->link;
					q->link = p;
					if (p != head )
						r->link = q;
					else
						head  = q;
					temp = p;
					p = q;
					q = temp;
				}
			}
		}
	}

	void mergeLists1(const SingleLinkedList &L, SingleLinkedList &mergedList)
	{
		mergedList.head  = merge1(head , L.head );
	}

	void mergeLists2(SingleLinkedList &L, SingleLinkedList &mergedList)
	{
		mergedList.head  = merge2(head , L.head );
		head  = NULL;
		L.head  = NULL;
	}

	void mergeSort()
	{
		head  = mergeSortRec(head );
	}
};

int main()
{
	SingleLinkedList list;
	list.createList();

	int choice, data, x, position;

	while (1)
	{
		cout << "\n";
		cout << "1.Display list\n";
		cout << "2.Count the number of nodes\n";
		cout << "3.Search for an element\n";
		cout << "4.Insert in empty list/Insert in beginning of the list\n";
		cout << "5.Insert a node at the end of the list\n";
		cout << "6.Insert a node after a specified node\n";
		cout << "7.Insert a node before a specified node\n";
		cout << "8.Insert a node at a given position\n";
		cout << "9.Delete first node\n";
		cout << "10.Delete last node\n";
		cout << "11.Delete any node\n";
		cout << "12.Reverse the list\n";
		cout << "13.Insert Cycle\n";
		cout << "14.Detect Cycle\n";
		cout << "15.Remove cycle\n";
		cout << "16.Bubble sort by exchanging data\n";
		cout << "17.Bubble sort by exchanging links\n";
		cout << "18.MergeSort\n";
		cout << "19.Quit\n";

		cout << "Enter your choice : ";
		cin >> choice;

		if (choice == 19)
			break;

		switch (choice)
		{
		case 1:
			list.displayList();
			break;
		case 2:
			cout << "Number of nodes is " << list.countNodes() << "\n";
			break;
		case 3:
			cout << "Enter the element to be searched : ";
			cin >> data;
			position = list.find(data);
			if (position == 0)
				cout << data << " not in list\n";
			else
				cout << data << " present at position " << position << "\n";
			break;
		case 4:
			cout << "Enter the element to be inserted : ";
			cin >> data;
			list.insertAtBeginning(data);
			break;
		case 5:
			cout << "Enter the element to be inserted : ";
			cin >> data;
			list.insertAtEnd(data);
			break;
		case 6:
			cout << "Enter the element to be inserted : ";
			cin >> data;
			cout << "Enter the element after which to insert : ";
			cin >> x;
			list.insertAfter(data, x);
			break;
		case 7:
			cout << "Enter the element to be inserted : ";
			cin >> data;
			cout << "Enter the element before which to insert : ";
			cin >> x;
			list.insertBefore(data, x);
			break;
		case 8:
			cout << "Enter the element to be inserted : ";
			cin >> data;
			cout << "Enter the position at which to insert : ";
			cin >> position;
			list.insertAtPosition(data, position);
			break;
		case 9:
			list.deleteFirstNode();
			break;
		case 10:
			list.deleteLastNode();
			break;
		case 11:
			cout << "Enter the element to be deleted : ";
			cin >> data;
			list.deleteNode(data);
			break;
		case 12:
			list.reverseList();
			break;
		case 13:
			cout << "Enter the element at which the cycle has to be inserted : ";
			cin >> data;
			list.insertCycle(data);
			break;
		case 14:
			if (list.hasCycle())
				cout << "List has a cycle\n";
			else
				cout << "List does not have a cycle\n";
			break;
		case 15:
			list.removeCycle();
			break;
		case 16:
			list.bubbleSortExData();
			break;
		case 17:
			list.bubbleSortExLinks();
			break;
		case 18:
			list.mergeSort();
			break;
		default:
			cout << "Wrong Choice\n";
			break;
		}
	}
	cout << "Exiting \n";
}