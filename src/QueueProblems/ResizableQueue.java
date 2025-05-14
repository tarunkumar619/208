package QueueProblems;

import java.util.NoSuchElementException;

public class ResizableQueue<T> implements IQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private static final double LOAD_FACTOR = 0.7;

    public ResizableQueue(int initialCapacity) {
        data = new Object[initialCapacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        if ((double) size / data.length >= LOAD_FACTOR) {
            resize();
        }

        // First element to insert
        if (empty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % data.length;
        }

        data[rear] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        if (empty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        T value = (T) data[front];
        data[front] = null;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % data.length;
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
        return size == 0;
    }

    private void resize() {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }

        data = newData;
        front = 0;
        rear = size - 1;
    }
}
