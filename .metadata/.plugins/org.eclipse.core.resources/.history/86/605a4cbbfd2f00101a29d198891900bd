package Arrays_Practice;
import java.util.*;
public class Kadanes_Algorithm {
// getting maximum sum from array
	
	public static int  max_subarray(int arr[]) {
		int osum=arr[0];
		int csum=arr[0];
		
		for(int i=1 ;i <arr.length ; i++ ) {
			
			if(csum>=0) {
				csum+=arr[i];
			}
			else {
				csum=arr[i];
			}
			if(csum>osum){
				osum=csum;
			}
			
		}

		return osum;
	}
	
	public static int  cirular_sub_array(int nums[]) {
		int max =max_subarray(nums);
		
		int total_sum=0;
		
		if(max < 0)  return max;
		
		
		for(int  i= 0 ; i < nums.length ; i ++) {
			total_sum = total_sum  +  nums[i];
			nums[i] = nums[i] * -1;
		}
		
		int min = max_subarray(nums);
		
		int circular_sum = total_sum + min;
		
		return  Math.max(total_sum, circular_sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of array : " );
		int n = sc.nextInt();
		int [] arr= new int[n];
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.println("Please enter the value");
			arr[i]=sc.nextInt();
		}
//		
//	System.out.println(max_subarray(arr));	
	System.out.println(cirular_sub_array(arr));	
		
		
		
		
		
		
		
	}

}
