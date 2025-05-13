package LinkedListPractice;

public class DoublyCircularLinkedList implements ILinkedList {
	public dNode  dummy;
	
	public DoublyCircularLinkedList() { 
	dummy=new dNode(null);
	}
	
	
	@Override
	public void addLast(product pro) {
	 	if(dummy.next==null && dummy.previous==null) {
	 		dNode newnode = new dNode(pro);
	 		dummy.next = newnode;
	 		dummy.previous = newnode;
	 		newnode.next =     dummy;
	 		newnode.previous=  dummy;
	 		return;
	 	}  
	 	
	 	// general condition
	 	dNode newnode = new dNode(pro); 
	 	
	 	
	 	newnode.next = dummy;
	 	newnode.previous =  dummy.previous;
	 	dummy.previous.next=newnode;
	 	dummy.previous = newnode;
	 	
	 	
	 	
		
		
	}

	@Override
	public product deleteFirst(product node) {
		if(dummy.next==null&&dummy.previous==null)
			return null;
		
		
		    if (dummy.next == dummy.previous) {
		     product deletedProduct = dummy.next.pro;
		        dummy.next = null;
		        dummy.previous = null;
		        return deletedProduct;
		    }
		
	
		
		//genral case
		product delpro=dummy.next.pro;
		dummy.next= dummy.next.next;
		dummy.next.previous=dummy;
	
	 		return delpro;
	}

	@Override
	public void displayAll() {
		dNode  current = dummy.next;
		
		if(current==null) {
			System.out.println("list is empty");
			return;
			
		}
		
		System.out.print("\n -----------------Product list--------------- \n--------");
		while(current!=dummy){
			System.out.println();
            System.out.println(current.pro.toString());			
			current = current.next;
		}
	
	}

	@Override
	public void Update(product product) {
		 dNode  current = dummy.next;
		 
			if(current==null) {
				System.out.println("list is empty");
				return;
				
			}
			
			while(current!=dummy){
                   if((current.pro.getName()).equalsIgnoreCase(product.getName())) {
                	   current.pro=product;
                	   return;
                   }	
				current = current.next;
			}
			
			
		    System.out.println("Product not found.");
		 
	}
       
		
}
