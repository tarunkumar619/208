import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
        System.out.println("please entre the value");
		    int num1 = obj.nextInt();	   
	        System.out.println(isArmstrong(num1));  		
	}

	public static boolean isArmstrong(int num) {		 
		String numstr= Integer.toString(num);	
		int count =numstr.length();		
		int sum=0;
		int temp=num;
		while(temp>0) {
		int digit=temp%10;
		sum+=Math.pow(digit, count);
		temp/=10;			
		}		
		return sum==num;
	}	
}
