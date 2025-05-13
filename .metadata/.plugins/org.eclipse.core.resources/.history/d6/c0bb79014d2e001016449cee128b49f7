import java.util.*;
public class GCDLCM {
	public static int gcd(int a, int b) {
		if(b==0)
		return a;
		return gcd(a,a%b);		
	}	
	public static int lcm(int a, int b) {
		return Math.abs(a * b) / gcd(a, b);		
	}	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int gcd = gcd(num1, num2);
        int lcm = lcm(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}
}
