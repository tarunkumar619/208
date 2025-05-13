import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int n = sc.nextInt();
        int temp = (n + 1) / 2;
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (i <= temp) {
                k++;
            } else {
                k--;
            }

            for (int j = 1; j <= n; j++) {
                if (j <= 2 * (temp - k) + 1) {  
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}