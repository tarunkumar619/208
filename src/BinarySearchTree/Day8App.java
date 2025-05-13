package BinarySearchTree;

public class Day8App {

	public static void testBST01() {
		BST bst01 = new BST();
		
		bst01.insert(10);
		bst01.insert(5);
		bst01.insert(8);
		
		if (bst01.search(1) == true) {
			System.out.println("1 is present in BST.");
		} else {
			System.out.println("1 is NOT present in BST.");
		}

		if (bst01.search(5) == true) {
			System.out.println("5 is present in BST.");
		} else {
			System.out.println("5 is NOT present in BST.");
		}
	}

	public static void testBST02() {
		BST bst01 = new BST();
		
		int[] valuesToInsert = {10, 5, 8,20, 15, 30, 1, 12};

		for (int value : valuesToInsert) {
			bst01.insert(value);
		}

		int[] valuesToSearch = {1, 5, 100, 4, 20};

		for (int value : valuesToSearch) {
			if (bst01.search(value) == true) {
				System.out.println(value + " is present in BST.");
			} else {
				System.out.println(value + " is NOT present in BST.");
			}
		}
		
		System.out.println("BST elements are ...");
		bst01.printUsingInorder();
	}

	public static void main(String[] args) {
		//testBST01();
		testBST02();
	}

}
