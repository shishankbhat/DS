#include <iostream>
#include <queue>
using namespace std;

class node
{
public:
    int data;

    // left node
    node *left;

    // right node
    node *right;

    // constructor for initialize the value

    node(int d) 
    {
        this->data = d;
        this->left = NULL;
        this->right = NULL;
    }
};
// Tree insertion
node *buildtree(node *root) // here node* help to return the root changes
{
    cout << "Enter data :" << endl;
    int data;
    cin >> data;

    root = new node(data);
    if (data == -1)
    {
        return NULL;
    }

    cout << "Enter data for Left part of the tree " << data << " is " << endl;

    root->left = buildtree(root->left);

    cout << "Enter data for Right part of the tree " << data << " is " << endl;

    root->right = buildtree(root->right);

    return root;
}

// Displat tree in level order traversal

void levelordertraversal(node *root)
{
    queue<node *> q;

    // insert root element

    q.push(root); // we can't enter the data directly because our queue is node* type not a int type
    q.push(NULL); // for print in level (It work as a seprator)

    while (!q.empty())
    {
        node *temp = q.front();

        q.pop();
        /*
         if u want to print from right to left

        if(temp->right != NULL){
            q.push(temp->right);
        }
        if(temp->left != NULL){
            q.push(temp->left);
        }
        */

        // It will print from left to right

        /*
        if u want to print in level wise(output will also show in level order then we use seprator i.e. temp == null)*/
        if (temp == NULL)
        { // purana level complete traverse ho chuka he
            cout << endl;
            if (!q.empty())
            { // queue still has some child nodes
                q.push(NULL);
            }
        }
        else
        {
            cout << temp->data << " ";
            if (temp->left != NULL)
            {
                q.push(temp->left);
            }

            if (temp->right != NULL)
            {
                q.push(temp->right);
            }
        }
    }
}


/* Print inordertraversal(LNR) */

void inordertraversal(node* root){
    // Base case

    if(root == NULL)
        return;
    
    // LNR

    inordertraversal(root->left);//L
    cout<<root->data << " ";//N
    inordertraversal(root->right);//R

}

/* Print preordertraversal (NLR)*/

void preordertraversal(node* root){
    // Base case

    if(root == NULL)
        return;
    
    // LNR
    cout<<root->data << " ";//N
    preordertraversal(root->left);//L 
    preordertraversal(root->right);//R

}

/* Print postordertraversal (LRN)*/

void postordertraversal(node* root){
    // Base case

    if(root == NULL)
        return;
    
    // LNR
    
    postordertraversal(root->left);//L
    postordertraversal(root->right);//R
    cout<<root->data << " ";//N
}

// build from level order

void buildfromlevelorder(node* &root){
    queue<node*> q;
    cout <<"Enter data for root "<<endl;
    int data;
    cin >> data;
    root = new node(data);
    q.push(root);

    while(!q.empty()){
        node* temp = q.front();
        q.pop();

        cout<< "Enter left node for :"<<temp->data << endl;
        int leftdata;
        cin >> leftdata;

        if(leftdata != -1){
            temp->left = new node(leftdata);
            q.push(temp->left);
        }


        cout<< "Enter right node for :"<<temp->data << endl;
        int rightdata;
        cin >> rightdata;

        if(rightdata != -1){
            temp->right = new node(rightdata);
            q.push(temp->right);
        }
    }
}

int main()
{
    node *root = NULL;

    buildfromlevelorder(root);
    cout << "Print the level order traversal output " << endl;
    levelordertraversal(root);

    // 1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1
    /*
    cout << "\nFor null value insert -1 " << endl;

    root = buildtree(root);

    // 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1

    // print the tree in Level order traversal form(level wise)
    cout << "Print the level order traversal output " << endl;
    levelordertraversal(root);
    
    cout<<endl;
    cout<< "Inorder traversal is :";
    inordertraversal(root);

    cout<<endl;
    cout<< "Preorder traversal is :";
    preordertraversal(root);

    cout<<endl;
    cout<< "Postorder traversal is :";
    postordertraversal(root);

    */
   
}