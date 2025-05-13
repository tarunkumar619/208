package Arrays_Practice;

import java.util.Scanner;

public class Dupplicate_Array {

	
	 public static  int removeDuplicates(int[] nums) {
	        int n =nums.length;
	        if (n == 0) return 0;
	        int i=0;
	        int j=1;
	        
	        while(j<n){
	      if(nums[i]!=nums[j]){     
	          nums[++i]=nums[j];          
	      }	
	            j++;
	        }
	        
	        return i+1;
	    }
	
	

	public static void main(String[] args) {		
	      Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of n");
	        int n = sc.nextInt();
	        int[] nums = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter value for nums[" + i + "]");
	            nums[i] = sc.nextInt();
	        }
		
	        
		System.out.println("duplicates value inside in this array: "+removeDuplicates(nums));
		
				
		
	}
	
	
}
