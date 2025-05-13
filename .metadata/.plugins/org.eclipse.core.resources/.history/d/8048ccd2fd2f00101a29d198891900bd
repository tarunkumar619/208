package Arrays_Practice;

import java.util.Scanner;

public class Maximum_consecutive_1s {
   
	public static int   max_con(int arr[]) {
		int count=0;
		
		int max=0;
		for(int i =0 ; i <=arr.length-1 ; i++) {
			if(arr[i]!=0) {
				count++;
				max= Math.max(max, count);
			}
			else
			count=0;
		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
           System.out.println("total 1 max element inside the array is : "+ max_con(nums));   
        
	}

}
