import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entre the value of row");
		int row = sc.nextInt();
		int n;
		if (row % 2 == 0)
			n = row / 2;
		else
			n = (row / 2) + 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
