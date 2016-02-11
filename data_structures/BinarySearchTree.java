package data_structures;

public class BinarySearchTree {

	Node root;
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	
	
	public BinarySearchTree() 
	{
		root = null;
	}
	
	void insertNode( int value)
	{
		root = insertRec(root,value);
	}
	
	Node insertRec(Node root, int value)
	{
		
		
		if(root == null)
		{
			root.data = value;
			root.left = null;
			root.right = null;
			return root;
		}
		
		if(root.data > value)
		{
				root.left = insertRec(root.left, value);
			
		}
		else
		{
			root.right = insertRec(root.right, value);
			
		}
		
		return root;
		
	}
	
	public static void main(String[] args)
	{
		BinarySearchTree b = new BinarySearchTree();
		
		
	}
	
	
	
}
