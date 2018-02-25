package T;
public class Tree {

	Node root;
	
	public Tree(int item){
		
		root.item=item;
		
	}
	public Tree(){
		root =null;
	}
	
	void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.item + " ");
    }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.item + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
 
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.item + " ");
 
        /* then recur on left sutree */
        printPreorder(node.left);
 
        /* now recur on right subtree */
        printPreorder(node.right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree T = new Tree();
		 T.root= new Node(1);
		T.root.left = new Node(2);
		T.root.right = new Node(3);
		T.root.left.left = new Node(4);
        T.root.left.right = new Node(5);

        
        System.out.println("Preorder traversal of binary tree is ");
        T.printPreorder(T.root);
 
        System.out.println("\nInorder traversal of binary tree is ");
     T.printInorder(T.root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        T.printPostorder(T.root);
        
        
	}

}
