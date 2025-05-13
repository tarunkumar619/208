package Arrays_Practice;

import java.util.Scanner;
import java.util.Arrays;

public class Rotate_Array {
 // left rotate 
    public static void Left_rotate_array(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse_array(arr, 0, n - 1);

        reverse_array(arr, 0, k - 1);
      
        reverse_array(arr, k, n - 1);
    }

    // right 
    public static void Rigth_rotate_array(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse_array(arr, 0, n - 1);

        reverse_array(arr, 0, k);
      
        reverse_array(arr, k+1, n - 1);
    }

    public static void reverse_array(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static String array_to_string(int[] arr) {
        return Arrays.toString(arr); // Use Arrays.toString() to convert array to string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for nums[" + i + "]");
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the steps K");
        int k = sc.nextInt();

        System.out.println("Array before rotation:");
        System.out.println(array_to_string(nums));  // Print array before rotation using toString

        Left_rotate_array(nums, k);

        System.out.println("Left Array after rotation:");
        System.out.println(array_to_string(nums));  // Print array after rotation using toString
       
        System.out.println("Enter the value of nr");
        int nr = sc.nextInt();
        int[] num = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.println("Enter value for num for right[" + i + "]");
            num[i] = sc.nextInt();
        }
      
        System.out.println("Enter the steps K");
        int kr = sc.nextInt();
        
        System.out.println(" Array before rotation:");
        System.out.println(array_to_string(num));  // Print array before rotation using toString

        Rigth_rotate_array(num, kr);

        System.out.println("Right Array after rotation:");
        System.out.println(array_to_string(num));  // Print array after rotation using toString
    }
}
