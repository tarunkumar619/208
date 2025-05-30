package LinkedListPractice;

public class SortedSinglyList implements SortedList {
    SListNode head;

    public SortedSinglyList() {
        head = null;
    }

    @Override
    public void insert(int element) {
        SListNode newNode = new SListNode();
        newNode.data = element;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return;
        }

        SListNode current = head;
        SListNode previous = null;
        while (current != null) {
            if (current.data > newNode.data) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            // Add newNode as first node.
            newNode.next = head;
            head = newNode;
            return;
        }

        // Add newNode between previous and current.
        previous.next = newNode;
        newNode.next = current;
    }

    @Override
    public void print() {
        SListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    // Method to delete a specific element
    @Override
    public void delete(int element) {
        SListNode current = head;
        SListNode previous = null;

        // Traverse the list to find the element
        while (current != null) {
            if (current.data == element) {
                break; // Element found, exit loop
            }
            previous = current;
            current = current.next;
        }

        // If current is null, element is not in the list
        if (current == null) {
            System.out.println("Element not present in the list");
            return;
        }

        // If the node to delete is the first node
        if (current == head) {
            head = head.next; // Move head to next node
            current = null;   // Mark node as free (optional in Java, for GC)
            return;
        }

        // Delete the node by skipping it in the list
        previous.next = current.next;
        current = null; // Mark node as free (optional)
    }
    
    
    // Method to delete all occurrences of a specific element
    @Override
    public void deleteAll(int element) {
        SListNode current = head;
        SListNode previous = null;

        while (current != null) {
            if (current.data == element) {
                // Case: Deleting first node
                if (current == head) {
                    head = current.next; // Move head forward
                    current = head;      // Restart from new head
                    previous = null;     // Reset previous
                } else {
                    // Case: Deleting middle or last node
                    previous.next = current.next;
                    current = previous.next; // Move to next node
                }
                // current node is now skipped, and Java GC will clean it up
            } else {
                previous = current;
                current = current.next;
            }
        }
    }


    // Method to search for a specific element
    @Override
    public boolean search(int element) {
        SListNode temp = head;

        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}
