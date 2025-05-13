package Arrays_Practice;

public class EquilibriumPoint {

public static int equilibrium(int arr[], int n) {
		
		int sum=0;
		int leftSum=0;
		// total sum of the array
		for(int i =0 ; i < n ; i++) {
			sum = sum + arr[i];
		}
		
	
		for(int i =0 ; i < n ; i ++) {
			sum = sum - arr[i];  // remove ith element .
			// this line get suffix from i ke baad ka suffix sum
			
			if(leftSum == sum) {  // checking  prefixSum = SufixSum
				return i;   // you can return index also	
 			}
			
			//   prefix sum  of the ith element
			 leftSum = leftSum + arr[i];
		}
		
		return -1;
		
		
		
	}
	
	
	
public static void main(String[] args) {
	int[] arr = new int[] {1, 3, 5, 2, 2};
System.out.println(equilibrium(arr , arr.length));

	
}


}
