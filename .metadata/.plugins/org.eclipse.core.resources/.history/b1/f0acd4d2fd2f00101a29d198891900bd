package Arrays_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class MovesZeros {	
	public static void  movieszero(int[] arr) {
		int current  = 0;
		int lastnonzero =0;
		int  n = arr.length;
		int temp=0;
		while(n> current) {
			if(arr[current ]!= 0) {
				temp=arr[current];
				arr[current]=arr[lastnonzero];
				arr[lastnonzero]=temp;
				lastnonzero++;
			}					
			current++;
		}
	}
	

	// 2nd approach
	
	public static void movezero(int nums[]) {
       int j=0;
       int n= nums.length-1;
       int temp=0;
       
       for(int i=0; i<=n ; i++) {
    	   if(nums[i]!=0) {
    	    temp=nums[i];
    	    nums[i]=nums[j];
    	    nums[j]=temp;   
    	   j++;
       }
      
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
    movezero(nums);
    System.out.println("after shifting array"+Arrays.toString(nums));	
}	
}
