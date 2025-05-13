package Arrays_Practice;

import java.util.Scanner;

// input [7 ,1  , 5 , 3 , 6 ,4]  day 1 = 1 rs price buy and sell day 5 = 6 profit = 6-1=5; 
public class buy_stocks {
     public static int buy_stock_1 (int nums[]) {
    	   int minPrice = Integer.MAX_VALUE;
    	   int maxProfit=0;
    	   int profit = 0;
    	   for(int i = 0  ; i <  nums.length ; i++) {
    		   if(minPrice  > nums[i]) {
    			   minPrice = nums[i];
    		   }    		  
    		   profit =nums[i] - minPrice;
    		 maxProfit= Math.max(maxProfit, profit);   		   
   		   
    	   }
    	 
    	
    	 return maxProfit;
     }
     
  // input [7 ,1  , 5 , 3 , 6 ,4]  day 1 = 1 rs price buy and sell day 2 = 5 profit = 5-1=4;
     //   buy at 3 and sell at 6 profit = 6-3 =3 then total profit = 4 + 3 =7
     public static int buy_stock_2(int nums[]) {
    	 
    	   int profit = 0;
    	   for(int i = 1 ; i < nums.length ; i++) { 
    		   if(nums[i-1] <  nums[i])
    		   {   
    		
    			   profit = profit + (nums[i]- nums[i-1]);
    		   }
 
    	   }
    	 
 return profit;   	 
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
		
System.out.println( " 1 nd problem : "	+buy_stock_1(arr) );
System.out.println(" 2 nd problem  : " +buy_stock_2(arr) );

	}

}
