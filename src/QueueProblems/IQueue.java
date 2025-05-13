package QueueProblems;

public interface IQueue {
	
	public void enqueue(int value);
	public int dequeue();
	public int peek();
	public boolean empty();
	
	
}
