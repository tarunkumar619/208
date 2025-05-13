package Arrays_Practice;

import java.util.Scanner;

public class Single_Number {
    // input [1,2,1,2,4] ouput is 4 beacuase that is single element //      
	
	public static int finding_single_element(int nums[]) {
		
		int result=0;
		for(int i=0 ; i<nums.length ; i++ ) {
			  result=nums[i]^result;
			
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
		
System.out.println(finding_single_element(arr));
	}

}
