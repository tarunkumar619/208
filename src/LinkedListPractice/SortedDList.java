package LinkedListPractice;

public class SortedDList implements SortedList{

	private DListNode head;
	private DListNode tail;

	public SortedDList() {
		head = null;
		tail = null;
	}

	@Override
	public void insert(int element) {
		// 1. Create new node
		DListNode newNode = new DListNode(element);

		// 2. If list is empty?
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		// 3. Traverse list to find node - current node.
		DListNode current = head;
		while (current != null) {
			if (current.data > element) {
				break;
			}
			current = current.next;
		}

		// 4. If adding before first node?
		if (current == head) {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}

		// 5. If adding after the last node?
		if (current == null) {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			return;
		}

		// 6. Add a new node between current and current's previous node.
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;
	}

	@Override
	public void print() {
		DListNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	@Override
	public void delete(int element) {
	     
		DListNode current = head;
		
		 while (current != null) {
		        // if (current node’s data == element)
		        if (current.data == element) {
		            // Found the node - end the traversal
		            break;
		        }
		        // Move current to current’s next node
		        current = current.next;
		    }
		 
		   // if (current is empty) => not found
		    if (current == null) {
		        System.out.println("Element " + element + " not found.");
		        return;
		    }
		    
		    if (current == head) {
		        // Move head to head’s next node
		        head = head.next;

		        // Has the list become empty?
		        if (head == null) {
		            // Set tail to empty
		            tail = null;
		        } else {
		            // Set the previous of head to empty
		            head.previous = null;
		        }

		        return; // Stop
		    }
		    
		    // Delete last node?
		    if (current == tail) {
		        // Move tail to tail’s previous node
		        tail = tail.previous;

		        // Set the next of tail node to empty
		        tail.next = null;

		        return; // Stop
		    }

		    // Delete a node in the middle
		    // Make current's next node come after current's previous node
		    current.previous.next = current.next;

		    // Make the current's previous node come before current's next node
		    current.next.previous = current.previous;

		    // Java automatically releases memory (no explicit deallocation)
		
		
		
		
	}

	@Override
	public void deleteAll(int element) {
	    DListNode current = head;

	    while (current != null) {
	        if (current.data == element) {
	            DListNode toDelete = current;

	            // Move current before deleting to preserve traversal
	            current = current.next;

	            // Handle deletion (same as single delete logic)
	            if (toDelete == head) {
	                head = toDelete.next;
	                if (head != null) {
	                    head.previous = null;
	                } else {
	                    tail = null; // list became empty
	                }
	            } else if (toDelete == tail) {
	                tail = toDelete.previous;
	                if (tail != null) {
	                    tail.next = null;
	                }
	            } else {
	                toDelete.previous.next = toDelete.next;
	                toDelete.next.previous = toDelete.previous;
	            }
	        } else {
	            current = current.next;
	        }
	    }
	}

	@Override
	public boolean search(int element) {
	    DListNode current = head;

	    while (current != null) {
	        if (current.data == element) {
	            return true;
	        }
	        current = current.next;
	    }

	    return false;
	}

}
