package Sorting;

	
public class SortingAlgorithms {
	public static int loopCount;

	public static void bubbleSort(int[] arr) {
		loopCount = 0;
		
		int elementsToSort = arr.length;
		while (elementsToSort > 1) {
			int left = 0;
			while (left < (elementsToSort - 1)) {
				++loopCount;
				if (arr[left + 1] < arr[left]) {
					int temp = arr[left];
					arr[left] = arr[left + 1];
					arr[left + 1] = temp;
				}
				++left;
			}
			--elementsToSort;
		}
	}

	public static void bubbleSortOptimised(int[] arr) {
		loopCount = 0;
		
		int elementsToSort = arr.length;
		while (elementsToSort > 1) {
			int left = 0;
			int swapCount = 0;
			while (left < (elementsToSort - 1)) {
				++loopCount;
				if (arr[left + 1] < arr[left]) {
					++swapCount;
					int temp = arr[left];
					arr[left] = arr[left + 1];
					arr[left + 1] = temp;
				}
				++left;
			}
			if (swapCount == 0) {
				break;
			}
			--elementsToSort;
		}
	}
	
	public static void selectionSort(int[] arr) {
		loopCount = 0;
		
		int elementPos = 0;
		while (elementPos < (arr.length - 1)) {
			int smallestElementPos = elementPos;
			int i = elementPos + 1;
			while (i < (arr.length)) {
				++loopCount;
				if (arr[i] < arr[smallestElementPos]) {
					smallestElementPos = i;
				}
				++i;
			}
			if (elementPos != smallestElementPos) {
				int temp = arr[elementPos];
				arr[elementPos] = arr[smallestElementPos];
				arr[smallestElementPos] = temp;
			}
			++elementPos;
		}
	}

	public static void insertionSort(int[] arr) {
		loopCount = 0;
		
		int sortedSize = 1;
		while (sortedSize < arr.length) {
			int elementToInsert = arr[sortedSize];
			int i = sortedSize - 1;
			
			while (i >= 0) {
				++loopCount;
				
				if (elementToInsert < arr[i]) {
					arr[i + 1] = arr[i];
				} else {
					break;
				}
				
				--i;
			}
			
			arr[i + 1] = elementToInsert;
			++sortedSize;
		}
	}

	static int[] mergedArray;
	private static void merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {
		//int[] mergedArray = new int [(endPos1 - startPos1 + 1) + (endPos2 - startPos2 + 1)];
		int i1 = startPos1;
		int i2 = startPos2;
		int r = 0;
		
		while ((i1 <= endPos1) && (i2 <= endPos2)) {
			if (arr[i1] < arr[i2]) {
				mergedArray[r] = arr[i1];
				++i1;
			} else {
				mergedArray[r] = arr[i2];
				++i2;
			}
			++r;
		}

		// Copy remaining elements from the other sorted array.
		while (i1 <= endPos1) {
			mergedArray[r] = arr[i1];
			++i1;
			++r;
		}
		while (i2 <= endPos2) {
			mergedArray[r] = arr[i2];
			++i2;
			++r;
		}

		int i = startPos1;
		int j = 0;
		while (j < r) {
			arr[i] = mergedArray[j];
			++i;
			++j;
		}
	}
	private static void mergeSort(int[] arr, int startPos, int endPos) {
		if ((endPos - startPos + 1) <= 1) {
			return;
		}

		int midPos = startPos + (endPos - startPos) / 2;
		mergeSort(arr, startPos, midPos);
		mergeSort(arr, midPos + 1, endPos);

		merge(arr, startPos, midPos, midPos + 1, endPos);
	}
	public static void mergeSort(int[] arr) {
		mergedArray = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1);
	}
}
