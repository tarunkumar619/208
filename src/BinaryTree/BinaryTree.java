package BinaryTree;

public class BinaryTree {
	BTNode root;
	int functionCount;
	
	public BinaryTree() {
		root = null;
	}

	public void buildTree01() {
		BTNode n1 = new BTNode(5);
		BTNode n2 = new BTNode(1);
		BTNode n3 = new BTNode(3);
		BTNode n4 = new BTNode(2);
		
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.leftChild = n4;
		
		root = n1;
	}

	private void inorder(BTNode root) {
		++functionCount;
		if (root == null) {
			return;
		}

		if (root.leftChild != null) {
			inorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			inorder(root.rightChild);
		}
	}
	public void inorder() {
		functionCount = 0;
		inorder(root);
		System.out.println("\nFunction called " + functionCount + " times.");
	}
}
