package Searching;

import java.util.Scanner;

public class BinarySearch {
	
	            
	         public static int BinarySearchFunction(int arr[],int x) {
	        	 
	              int low =0 ;
	              int high= arr.length-1;
	              int result=-1;
	              
	              while(low <= high) {
	            	  int mid = low + (high-low)/2;
	            	  
	            	  if(arr[mid]==x)
	            		  return x;
	            	  else if(arr[mid]< x){
	            		  low=mid+1;
	            	  }
	            	  else {
	            		  high=mid-1;
	            	  }
	            	  
	     	            	  
	            	  
	              }
	        	 
	       	 
	        	 
	        	 
	        	 return result;
	         }
	
	
               public static void main(String[] args) {
			       
           		Scanner sc = new Scanner(System.in);
        		System.out.println("please enter the size of array : " );
        		int n = sc.nextInt();
        		int [] arr= new int[n];
        		for(int i = 0 ; i <arr.length ; i++) {
        			System.out.println("Please enter the value");
        			arr[i]=sc.nextInt();
        		} 
            	   
            	   
            	   
        		System.out.println("Found the "+BinarySearchFunction(arr, 6));
            	   
            	   
            	   
            	   
            	   
			}
}
