package LinkedListPractice;

public class QueueSingleLinkedList implements ICustomQueue {
          
	
	private Node rear;
	private Node front;
	
	
	public QueueSingleLinkedList() {
		 rear= null;
		 front= null;
	}
 
	
	@Override
	public void enqueue(Integer value) {
		
		if(isEmpty()) {
			
			Node newnode=new Node(value);
			rear = newnode;
			front= newnode;
			
			
		}
		
		else {
			
		Node newnode=new Node(value);
		rear.next = newnode;
		rear= newnode;
		
		}
	}
	@Override
	public Integer dequeue() throws CustomEception {
	       
		if(isEmpty()) {
			
			 throw new  CustomEception("under flow condition emppty");
			
		}
		
		Node temp = front;
		
		front=front.next;
		Integer data= temp.data;	
		temp.next=null;
		temp=null;
		
			
		return data;
		
		

	}
	@Override
	public boolean isEmpty() {
		if(rear==null) 
			 {
			return true;
			}
		return false;
	}
	@Override
	public void display() {
		Node current = front;
		System.out.println(" \n displat data of linked List ");
		while(current!=null) {
			
		
			System.out.print(current.data+ " - ");
			
			current =current.next;
		}
		
		
			
		
	}
	
	
   	
	
	
	
	
	

}
