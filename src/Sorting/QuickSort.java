package Sorting;


public class QuickSort {

    public static void quickSort(int[] arr, int startPos, int endPos) {
        // base case = array sorted (number of elements <= 1)
        if ((endPos - startPos + 1) <= 1) {
            return;
        }
        
        // Array too big - Partition them into two parts around pivot and sort each of them
        int pivotPos = partition(arr, startPos, endPos);
        quickSort(arr, startPos, pivotPos - 1);
        quickSort(arr, pivotPos + 1, endPos);
    }
    
    private static int partition(int[] arr, int startPos, int endPos) {
        int pivotPos = startPos;
        int left = startPos + 1;
        int right = endPos;
        
        while (left <= right) {
            while ((left <= right) && (arr[left] <= arr[pivotPos])) {
                left++;
            }
            while ((left <= right) && (arr[pivotPos] < arr[right])) {
                right--;
            }
            if (left < right) {
                // Swap elements at left and right position
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        
        // Swap element at pivotPos and right
        int temp = arr[pivotPos];
        arr[pivotPos] = arr[right];
        arr[right] = temp;
        
        return right; // After swap, pivot element at right
    }
    
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        quickSort(array, 0, array.length - 1);
        
        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}