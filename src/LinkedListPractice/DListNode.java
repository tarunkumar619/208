package LinkedListPractice;

public class DListNode {
	int data;
	DListNode next;
	DListNode previous;
	
	public DListNode() {}

	public DListNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}
