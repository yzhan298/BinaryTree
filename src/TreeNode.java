
public class TreeNode {

	int data;
	TreeNode leftChild;
	TreeNode rightChild;
	
	//public TreeNode(int data) { // Constructor
		//this.data = data;
	//}
	
	public int getData() {
		return data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	
	public TreeNode getRightChild() {
		return rightChild;
	}
	
	public TreeNode find(int data) {
		if(this.data==data)
			return this;
		if(data<this.data && leftChild!=null)
			return leftChild.find(data);
		if(data>this.data && rightChild!=null)
			return rightChild.find(data);
		else
			return null;
	}
}
