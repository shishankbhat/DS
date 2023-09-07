/*
Linked List : It is a linear data structure, collection of nodes, node is a combination of data and adress of next node.
it is a dynamic datastructure and it can br shrink and grow on run time..So there is no memory wastage.insertion and deletion is easy ,,,no need of shifting
Singly linkedlist : if we have onepointer (next pointer) and can store one data is called singly linkedlist ..
*/

#include<iostream>
using namespace std;

// node class
class Node{
    public:
    //  Here we have two things data and address of next node
    int data;
    Node* next;

    // Constructor
    Node(int data){
        this->data = data;
        this->next = NULL;
    }

    // destructor for delete the node
    ~Node(){
        int value = this->data;
        if(this-> next != NULL){
            delete next;
            this->next = NULL;
        } 
        cout << "Memory is free for node with data " << value <<endl;
    }
};

// insertion from head

void InsertAtHead(Node* &head, int d){
    // new node create
    Node* temp = new Node(d);
    temp -> next = head;
    head = temp;
}

// Insert from tail

void InsertAtEnd(Node* &tail, int data){

    Node* newnode = new Node(data);
    tail -> next = newnode; // point tail with newnode
    // tail = tail ->next;
    tail = newnode;
}


bool iscircular(Node* tail){
    // If list is empty
    if(tail == NULL){
        return true;
    }
    if((tail->next) == NULL){
        return false;
    }
    Node* temp = tail->next;
    while (temp != tail && temp != NULL)
    {
        temp = temp->next;
    }
    if(temp == NULL){
        return false;
    }
    else   
        return true;
    
}

// traverse the array

void print(Node* &head){
    Node* temp = head;
    while (temp != NULL)
    {
        cout << temp -> data << " ";
        temp = temp->next;
    }

    cout << endl;
}

// deletenode from linked list on a specific position

void deletenode(int pos, Node* &head,Node* & tail){
    // delete start node
    if(pos == 1){
        Node* temp = head;
        head = head->next;
        // freem memory
        temp -> next = NULL;
        delete temp;
    }
    else{

        // delete both midddle and end node

        Node* currentptr = head;
        Node* preptr = NULL;
        int count = 1;
        while (count < pos)
        {
            preptr = currentptr;
            currentptr = currentptr-> next;
            count++;
        }
        if(currentptr -> next == NULL){
            tail = preptr;
        }
        preptr -> next = currentptr -> next;

        // assign null at currentptr
        currentptr -> next = NULL;
        delete currentptr;
    }  
}

int main(){
    // Create a new node
    Node* node = new Node(19); // create node
    
    // cout << node->data << endl;
    // cout << node->next << endl;

    
    // Insert from head
    Node* head = node;
   
    // print(head);
    InsertAtHead(head,12);
    InsertAtHead(head,15);

    print(head);
    

   // Insert from end

    Node* tail = node;

   /* InsertAtEnd(tail,45);

    print(head);
    cout << "Before delete the last node tail is " << tail -> data << endl; 
    deletenode(4,head,tail); // delete node tail is also update
    
    print(head);

    cout << " After delete the last node tail is " << tail -> data << endl; 
    */

   // check is it circular

   if(iscircular(head)){
    cout <<"circular"<<endl;
   }else{
    cout << "Not circular" << endl;
   }
   
}