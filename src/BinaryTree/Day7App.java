package BinaryTree;

public class Day7App {

	public static void testTraversal01() {
		BinaryTree bt01 = new BinaryTree();
		
		bt01.buildTree01();

		System.out.println("Inorder traversal ...");
		bt01.inorder();
	}

	public static void main(String[] args) {
		testTraversal01();
	}

}
