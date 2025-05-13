package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Occurrence {
    public static int FirstOccurence(int arr[],int x) {
   	 
        int low =0 ;
        int high= arr.length-1;
        int result=-1;
        
        while(low <= high) {
      	  int mid = low + (high-low)/2;
      	  
      	  if(arr[mid]==x) {
      		  result=mid;
      		  high= mid-1;
      	  }
      		 
      	  else if(arr[mid]< x){
      		  low=mid+1;
      	  }
      	  else {
      		  high=mid-1;
      	  }
      	  
	            	  
      	  
        }
  	 
 	 
 
  	 
  	 return result;
   }
    
    
    public static int LastOccurence(int arr[],int x) {
      	 
        int low =0 ;
        int high= arr.length-1;
        int result=-1;
        
        while(low <= high) {
      	  int mid = low + (high-low)/2;
      	  
      	  if(arr[mid]==x) {
      		  result=mid;
      		  low= mid+1;
      	  }
      		 
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
    	  
		System.out.println(Arrays.toString(arr));
		System.out.println("Found index"+FirstOccurence(arr,sc.nextInt() ));
		System.out.println("Found index"+LastOccurence(arr,sc.nextInt() ));
	}

}
