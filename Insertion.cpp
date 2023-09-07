#include<iostream>
using namespace std;
class LLNODE{
    public:
    int data;
    LLNODE* next;
    // default constructor
    LLNODE(int data){
        // cout <<"Constructor called " << endl;
        this -> data = data;
        this -> next = NULL;
        //cout << this -> data;
    }
};


void insertathead(LLNODE* &head, int d){
    // new LLNODE create
    LLNODE* temp = new LLNODE(d);
    temp -> next = head;
    head = temp;
}

// insert at end

void insertatend(LLNODE* &tail, int data){
    LLNODE* temp = new LLNODE(data);
    tail -> next = temp;
    tail = temp;   
}

// insert at specific position
void insertatpos(LLNODE* &head, int data, int pos, LLNODE* &tail){
    if(pos == 1){
        insertathead(head,data);
    }
    LLNODE* prev =NULL;
    LLNODE* currptr = head;
    int ctr = 1; // because 1 iteration i.e. n==1 is already consider
    while (ctr < pos)
    {
        prev = currptr;
        currptr = currptr -> next;
        ctr++;
    }
    // if element is on last position
    if(prev -> next == NULL){
        insertatend(tail,data);
        return;
    }
    LLNODE* temp = new LLNODE(data);
    temp->next = currptr;
    prev -> next = temp;
    
}


// print ll (traverse the array)

void printll(LLNODE* &head){
    LLNODE* temp = head;
    while (temp != NULL)
    {
        cout << temp -> data << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main(){
    LLNODE* newnode = new LLNODE(5);
    LLNODE* head = newnode; // set head
    //cout << head -> data;
    insertathead(head,15);
    //printll(head);
    LLNODE* tail = newnode;
    insertatend(tail,50);
    //printll(head);

    insertatpos(head,60,3,tail);
    insertatpos(head,47,5,tail);

    insertatpos(head,10,4,tail);
    insertatpos(head,786,7,tail);
    printll(head);
    cout << "head " << head -> data <<endl << "tail " << tail-> data << endl;
}