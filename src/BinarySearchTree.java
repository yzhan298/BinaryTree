
public class BinarySearchTree {
	
	TreeNode root = new TreeNode();

	public void insert(int d) {
		if(root == null)
			root.data = d;
		else if(root.leftChild == null && root != null && root.rightChild == null)
			root.leftChild.data = d;
		//if(root.rightChild == null && root != null && root.leftChild != null)
		else if(root.rightChild == null && root.leftChild != null && root != null)
			root.rightChild.data = d;
	}
	
	public void showTree() {
		System.out.println(root.data);
		System.out.print(root.leftChild.data+" "+root.leftChild.data);
	}
	
	
}
