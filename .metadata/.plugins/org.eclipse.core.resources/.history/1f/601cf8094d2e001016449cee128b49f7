import java.util.Iterator;
import java.util.Scanner;
public class PrimeRange {	
	public static void primerange(int start , int end) {		
	    System.out.println("Prime numbers between " + start + " and " + end + ":");
	    boolean isPrime;    
	   
	    for(int i=start; i<=end ; i++ ) {    	
	    	if(i>1)	
	    	{
	    		isPrime=true;	    		
	    		for(int j=2 ; j<=Math.sqrt(i); j++) {	    			
	    			if(i%j==0) {
	    		     isPrime = false;
	                 break;	
	    			}	    			
	    		}	    		
	    		  if (isPrime) {
	                    System.out.print(" "+i+" ");  }	    		
	    	}	    	
	    }		
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the value of starting");
		int start = sc.nextInt();
		System.out.println("entre the value of end");
		int end= sc.nextInt();

         if(start<=end)
        primerange(start, end);
         else
         {
        		System.out.println("starting value cannot be greater than ending value pleae enter valid value "); 
  
         }
		
		
		
	}
	
	
}
