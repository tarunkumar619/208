package Arrays_Practice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter the value");
	        int n = sc.nextInt();
		// Descreasing star 
	        for(int i = 1 ; i<=n ; i++ ) {
			
			for(int j=i ; j <=n ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	    // incresing star
		for(int i = 2 ; i<= n ; i++ ) {
			
			for(int j=1 ; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
