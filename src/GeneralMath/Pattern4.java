package GeneralMath;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int n = sc.nextInt();
   

        for (int i = 1; i <= n-1; i++) {
        	
         for(int j = i ;  j<=n ; j++  ) {
        	 System.out.print("*");
         }
         
         System.out.println(); 
        }
        
        for(int k=1 ; k <=n ; k++) {
         for(int l = 2 ;  l <= k ; l++  ) {
        	 System.out.print("*");
         }
         System.out.println(); 
        }
      
  
       
    }
}