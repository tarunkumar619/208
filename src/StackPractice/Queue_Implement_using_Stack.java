package StackPractice;

import java.util.LinkedList;
import java.util.Stack;
	
import QueueProblems.IQueue;

public class Queue_Implement_using_Stack  implements IQueue {
	public Stack<Integer> stack1;
	public Stack<Integer> stack2;
	
	
	public Queue_Implement_using_Stack() {
		this.stack1 = new Stack();
		this.stack2 = new Stack();
	}
	
	@Override
	public void enqueue(int value) {
		
		
		while(!stack1.isEmpty()) {
		stack2.push(stack1.pop());
		}
		
		stack1.push(value);
		
		
		while(!stack2.isEmpty()) {			
			stack1.push(stack2.pop());
		}
		
	}

	@Override
	public int dequeue() {	
	    if (stack1.isEmpty()) {
	        System.out.println("Queue underflow");
	        return -1;
	    }
	    return stack1.pop();
	}

	@Override
	public int peek() {
	    if (stack1.isEmpty()) {
	        System.out.println("Queue is empty");
	        return -1;
	    }
	    return stack1.peek();
	}

	@Override
	public boolean empty() {
	  
		return stack1.isEmpty();
	}
   
     
}
