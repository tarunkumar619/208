package Arrays_Practice;
import java.util.Scanner;

public class Second_largestElement {

	public static int Second_largest_element(int[] nums)
	{
		int first =Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int i=0; i< nums.length ; i++) {	
			if(nums[i]>first) {
				second=first;
				first=nums[i];			
			}
			else if(nums[i]<first  && nums[i]>second)
	         second=nums[i];			
		
		}	
		return (second==Integer.MIN_VALUE)? -1 : second;  
	}	
	
	
	public static int largest_element(int[] nums) {		
		if(nums.length<0)
			return -1;		
		int max=nums[0];
		for(int i=0; i< nums.length ; i++) {
				if(nums[i]>max) 
					max=nums[i];
		
		}	
		return max;
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
		
	        int x=Second_largest_element(nums);
	        int y= largest_element(nums);
	        
	        System.out.println("Frist lagest element :"+y);
	       System.out.println("second lagest element :"+x);
	}

}
