package LinkedListPractice;

public interface ICustomQueue {

	
	public void enqueue(Integer value);
	public Integer dequeue() throws CustomEception ;
	public boolean isEmpty();
	public void display();
	
	
}
