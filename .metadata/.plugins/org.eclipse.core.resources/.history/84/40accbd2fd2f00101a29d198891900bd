package Arrays_Practice;

public class Variable_Sliding_window {
         public static boolean  findSubarray(int sum , int arr[]) {
        	 int currentSum=0;
        	 int start=0;
        	 int end=0;
        	 
        	 for(end=0; end <=arr.length ; end++ ) {
        		 currentSum = currentSum +arr[end]; 
        		 
        		 while(currentSum > sum ) {
        			currentSum = currentSum - arr[start];
        			start++;
        		 }
        		 
        		 if(currentSum == sum)
        			 return true;
        	 }
        	 
        	 return false;
        	 
        	 
        	 
        	 
         }
	public static void main(String[] args) {
		 int[] arr1 = {1, 4, 20, 3, 10, 5};
	        int sum1 = 33;
	         System.out.println(findSubarray(sum1, arr1));
	        

	}

}
