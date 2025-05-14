package QueueProblems;

public interface IQueue<T> {
    void enqueue(T value);
    T dequeue();
    T peek();
    boolean empty();
}