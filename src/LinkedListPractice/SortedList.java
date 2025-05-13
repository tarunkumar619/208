package LinkedListPractice;


public interface SortedList {
    void insert(int element);
    void print();
    void delete(int element);           // Method to delete a specific element
    void deleteAll(int element);        // Method to delete all occurrences of an element
    boolean search(int element);        // Method to search for an element
}