package ctci_graphs;





public class BinaryTree {

	static Node root;
	
	int INT_MIN = 1;
	int INT_MAX = 5;
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int d)
		{
			data = d;
			left = right = null;
		}
 	}
	
	Boolean isBST()
	{
		return (isBST(root));
	}
	
	
	Boolean isBST(Node root)
	{
		return (isBSTUtil(root,INT_MIN,INT_MAX));
	}


	Boolean isBSTUtil(Node node,int min,int max)
	{
		
		
	    /* an empty tree is BST */
        if(node == null)
            return true;
         
        /* false if this node violates the min/max constraints */
        if(node.data < min || node.data > max)
            return false;
         
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        return (isBSTUtil(node.left, min, node.data-1) &&  // Allow only distinct values
        		isBSTUtil(node.right, node.data+1, max));  // Allow only distinct values 		
		
		
		
	}
	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(4);
		tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
          
        if(tree.isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
	}
	
	
}
