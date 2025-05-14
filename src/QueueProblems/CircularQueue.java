package QueueProblems;

import java.util.NoSuchElementException;

public class CircularQueue<T> implements IQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        front = -1;
        rear = -1;
    }

    @Override
    public void enqueue(T value) {
        if ((rear + 1) % capacity == front) {
            throw new IllegalStateException("Queue is full.");
        }

        // First element to insert
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        data[rear] = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        if (empty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        T value = (T) data[front];
        data[front] = null;

        if (front == rear) {
            // Queue is now empty
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (empty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return (T) data[front];
    }

    @Override
    public boolean empty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
	