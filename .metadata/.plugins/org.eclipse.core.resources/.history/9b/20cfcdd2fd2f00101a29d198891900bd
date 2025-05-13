package Arrays_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Single_Element {

    public static int findSingleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the number that occurs only once
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        
        return -1; // Return -1 if no single element is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int singleNumber = findSingleNumber(nums);
        if (singleNumber != -1) {
            System.out.println("The single number is: " + singleNumber);
        } else {
            System.out.println("No single number found.");
        }

        scanner.close();
    }
}
