package QueueProblems;

import java.util.NoSuchElementException;

public class ResizableCircularQueue<T> implements IQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private static final double LOAD_FACTOR = 0.7;

    // Constructor: Initialize queue with an initial capacity
    public ResizableCircularQueue(int initialCapacity) {
        data = new Object[initialCapacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        // Check if resizing is needed (load factor exceeded)
        if ((double) size / data.length >= LOAD_FACTOR) {
            resize();
        }

        // If queue is empty, both front and rear should point to the first element
        if (empty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % data.length;
        }

        // Insert the value
        data[rear] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        // If the queue is empty, throw an exception
        if (empty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        // Remove the element at the front
        T value = (T) data[front];
        data[front] = null;  // Clear the spot

        // Adjust the front pointer for the circular structure
        if (size == 1) {
            front = -1;  // If the queue becomes empty, reset front and rear
            rear = -1;
        } else {
            front = (front + 1) % data.length;
        }

        size--;
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        // If the queue is empty, throw an exception
        if (empty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        return (T) data[front];
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    // Resize the array when the load factor is exceeded
    private void resize() {
        int newCapacity = data.length * 2;  // Double the capacity
        Object[] newData = new Object[newCapacity];

        // Copy elements from the old array to the new one
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];  // Circular copy
        }

        // Update data to the new array
        data = newData;

        // Reset front and rear for the new array
        front = 0;
        rear = size - 1;
    }
}
