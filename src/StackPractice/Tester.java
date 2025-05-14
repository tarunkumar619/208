package StackPractice;
import LinkedListPractice.product;		

		
		public class Tester {
		
			public static void main(String[] args) {
		        product product1 = new product(1, "Laptop", "Electronics", 1200.00);
		        product product2 = new product(2, "Chair", "Furniture", 150.00);
		        product product3 = new product(3, "Shirt", "Clothing", 30.00);

		        // Print product details
		        System.out.println(product1);
		        System.out.println(product2);
		        System.out.println(product3);
		        
		        // Demonstrate usage of the Resizeable Stack
		        ResizeableStack stack = new ResizeableStack();
		        
		        // Push product prices onto the stack (example)
		        stack.push((int) product1.getPrice());
		        stack.push((int) product2.getPrice());
		        stack.push((int) product3.getPrice());
		        
		        // Pop and display the prices
		        System.out.println("Popped Price: " + stack.pop());
		        System.out.println("Popped Price: " + stack.pop());
		        System.out.println("Popped Price: " + stack.pop());
		
		
		
			}
		
		}
