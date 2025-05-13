package StackPractice;

import java.util.Arrays;

public class ResizeableStack  implements  IStack {
    private int[] stack;
    private int top;
    private int capacity;
    private static final int INITIAL_CAPACITY = 5;
    private static final int LOAD_FACTOR = 2;

    public ResizeableStack() {
        this.capacity = INITIAL_CAPACITY;
        this.stack = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int value) {
        if (top + 1 == capacity) {
            resize();
        }

        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    private void resize() {
        int newCapacity = capacity * LOAD_FACTOR;
        stack = Arrays.copyOf(stack, newCapacity); 
        capacity = newCapacity;
        System.out.println("Resized stack to capacity: " + capacity);
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

	@Override
	public boolean empty() {
	if(top == -1) return true;
		
		return false;
	}
	


}
