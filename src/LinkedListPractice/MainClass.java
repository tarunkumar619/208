package LinkedListPractice;

public class MainClass {
public static void main(String[] args) {
	
	
	QueueSingleLinkedList obj = new QueueSingleLinkedList();
	
	
	obj.enqueue(15);
	obj.enqueue(25);
	obj.enqueue(35);
	obj.enqueue(45);
	obj.enqueue(65);
	obj.enqueue(75);

	
	obj.display();
	
	try {
		obj.dequeue();
		obj.dequeue();

		
	} catch (CustomEception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	obj.display();
	
	
	
	
}
}
