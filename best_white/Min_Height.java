package best_white;

//package best_white;

//mport best_white.Min_Height.TreeNode;

public class Min_Height {

	TreeNode root;
	 public static class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x)
		      { 
		    	  val = x; 
		      }
	  }

	 public static int minHeight(TreeNode root){
         if (root==null) return -1;
         return 1+Math.min(minHeight(root.left), minHeight(root.right));
     }
	 
	 public static void main(String[] args)
	 {
		 Min_Height tree = new Min_Height();
		 tree.root = new TreeNode(4);
		 tree.root.left = new TreeNode(3);
		 tree.root.left.left = new TreeNode(4);
		 tree.root.left.left.left = new TreeNode(6);
		 tree.root.left.left.left.left = new TreeNode(6);
		 tree.root.right = new TreeNode(5);
		 System.out.println(Min_Height.minHeight(tree.root));
		 
	 }
}
