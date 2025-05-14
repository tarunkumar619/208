package BinarySearchTree;

import BinaryTree.BTNode;

public class BST {
	BTNode root;
	
	public BST() {
		root = null;
	}

	public void insert(int element) {
		BTNode newNode = new BTNode(element);
		
		if (root == null) { 
			root = newNode;
			return;
		}

		BTNode current = root;
		while (current != null) {
			if (element < current.data) {
				if (current.leftChild == null) {
					current.leftChild = newNode;
					return; // Or break the loop.
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = newNode;
					return; // Or break the loop.
				}
				current = current.rightChild;
			}
		}
	}
	
	public boolean search(int element) {
		BTNode current = root;
		
		while (current != null) {
			if (element == current.data) {
				return true;
			}
			
			if (element < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}

		return false;
	}

	private void printUsingInorder(BTNode root) {
		if (root == null) {
			return;
		}

		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}
	public void printUsingInorder() {
		printUsingInorder(root);
	}
	
	
//	Finding the target node using traversal with parent and current pointers.
//
//	Leaf node deletion: Updates the parent’s child reference to null.
//
//	Single-child node deletion: Links the parent to the target’s only child.
//
//	Two-child node deletion:
//
//	Finds the inorder successor (leftmost node in the right subtree).
//
//	Swaps data with the successor.
//
//	Deletes the successor (handling leaf and single-child cases for the successor).
	
	

	public void delete(int element) {
	    // Initialize pointers
	    BTNode parent = null;
	    BTNode current = root;
	    
	    
	    // traversing logic 
	    // Find the node to be deleted
	    while (current != null) {
	        if (element == current.data) {
	            break; // Element found, end traversal
	        }
	        
	        parent = current;
	        if (element < current.data) {
	            current = current.leftChild;
	        } else {
	            current = current.rightChild;
	        }
	    }
	    
	    // Element not found
	    if (current == null) {
	        return;
	    }
	    
	    
	    
	    // Case 1: Deleting a leaf node
	    if (current.leftChild == null && current.rightChild == null) {
	        if (current == root) {
	            root = null; // Deleting the only node in the tree
	        } else if (current == parent.leftChild) {
	            parent.leftChild = null;
	        } else {
	            parent.rightChild = null;
	        }
	        return;
	    }
	    
	    // Case 2: Deleting a node with one child
	    BTNode childOfCurrent = null;
	    if (current.leftChild == null) {
	        childOfCurrent = current.rightChild;
	    } else if (current.rightChild == null) {
	        childOfCurrent = current.leftChild;
	    }
	    
	    
	
	    if (childOfCurrent != null) {
	        if (current == root) {
	            root = childOfCurrent;
	        } else if (current == parent.leftChild) {
	            parent.leftChild = childOfCurrent;
	        } else {
	            parent.rightChild = childOfCurrent;
	        }
	        return;
	    }
	    
	    
	    
	    // Case 3: Deleting a node with two children
//	    The inorder successor of a node in a BST is defined
//	    as the smallest node in its right subtree
	    
	    
	    BTNode inOrderSuccessorParent = current;
	    BTNode inOrderSuccessor = current.rightChild;
	    
	    // Find the inorder successor (leftmost node in right subtree)
	    while (inOrderSuccessor.leftChild != null) {
	        inOrderSuccessorParent = inOrderSuccessor;
	        inOrderSuccessor = inOrderSuccessor.leftChild;
	    }
	    
	    // Swap data with inorder successor
	    int temp = current.data;
	    current.data = inOrderSuccessor.data;
	    inOrderSuccessor.data = temp;
	    
	    // Delete the inorder successor (which has at most one right child)
	    if (inOrderSuccessor.leftChild == null && inOrderSuccessor.rightChild == null) {
	        // Inorder successor is a leaf node
	        if (inOrderSuccessor == inOrderSuccessorParent.leftChild) {
	            inOrderSuccessorParent.leftChild = null;
	        } else {
	            inOrderSuccessorParent.rightChild = null;
	        }
	    } else {
	        // Inorder successor has one child (right child)
	        BTNode successorChild = inOrderSuccessor.rightChild;
	        
	        if (inOrderSuccessor == inOrderSuccessorParent.leftChild) {
	            inOrderSuccessorParent.leftChild = successorChild;
	        } else {
	            inOrderSuccessorParent.rightChild = successorChild;
	        }
	    }
	}
	
	
	
	
	
}
