package Arrays_Practice;

import java.util.Scanner;

public class Reverse_Array {

	public static void  Reverse(int nums[]) {
	 int low=0,high=nums.length-1;
       int temp=0;
	 while(low<high) {
		 temp=nums[low];
		 nums[low]=nums[high];
		 nums[high]=temp;
		 low++;
		 high--;
	 }	
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
	        for (int i = 0; i < n; i++) {
	            System.out.print(" "+nums[i]);     
	        }	
	        
	        System.out.println("   after reveser : "); 
	        Reverse(nums);
	        
	       
	        for (int i = 0; i < n; i++) {
	            System.out.print(" "+nums[i]);
	       
	        }
		

	}

}
