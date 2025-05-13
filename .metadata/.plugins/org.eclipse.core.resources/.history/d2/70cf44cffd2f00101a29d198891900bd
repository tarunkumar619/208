import java.util.Scanner;  // import
public class Resverse {   // class resverse	
	public int reverse(int num) {  // member function		
		int res_num = 0;
		int last_digit;
		while (num > 0) {
			last_digit = num % 10;
			res_num = res_num * 10;
			res_num = res_num + last_digit;
			num = num / 10;
		}
		return res_num;
	}
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);    // create object
		System.out.println("enter the value");	
        int temp=sc.nextInt();		  // call function of scanner class for taking input as integer 	
		Resverse obj = new Resverse();
		int k = obj.reverse(temp);
		System.out.println(k);
	}

}
