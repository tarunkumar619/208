package Arrays_Practice;
import java.util.*;
public class Leaders_Array {

	public static void Leader_Array(int nums[]) {
	int current_leader= nums[nums.length-1];	
	
	System.out.print(" "+nums[nums.length-1]);
	
	for(int i=nums.length-2 ; i>=0 ; i--) {
		if(current_leader<nums[i]) {
			current_leader=nums[i];
			System.out.print(" "+current_leader);
		}
	}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the value inside the array");
		int n= sc.nextInt();
	  
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Please enter the element inside the array ["+i+"]");
			arr[i]= sc.nextInt();
		}
		Leader_Array(arr);
	
		
	}

}
