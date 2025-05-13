package Arrays_Practice;

import java.util.Scanner;

public class Left_Rotate {

	public static void LeftByOne(int nums[]) {
		int n= nums.length;
		int temp=nums[0];
		for(int i=1;i <= n-1 ;i ++) {
			nums[i-1]=nums[i];			
		}	
		nums[n-1]=temp;
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
		   
	        
	        System.out.println("Before : ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(" "+nums[i]);
	       
	        }
	        	        
	        System.out.println();
	        LeftByOne(nums);
	   
	        System.out.println("After  : ");  
	        for (int i = 0; i < n; i++) {
	            System.out.print(" "+nums[i]);
	       
	        }
	        

	}

}
