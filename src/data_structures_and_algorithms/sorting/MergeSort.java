package data_structures_and_algorithms.sorting;

public class MergeSort {

	public void mergeSort() {
		int[] arr = { 0, 1, 2, 4, 6, 5, 3 };
		int[] temp = new int[7];
		divide(arr, temp, 0, 6);
		System.out.println("Sorted array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		int number = findMedian(arr);
		System.out.println("Median number: " + number);
	}
	
	private void divide(int[] arr, int[] temp, int start, int end) {
		if(start < end) {
			int mid = start + (end - start) / 2; 
			divide(arr, temp, start, mid);
			divide(arr, temp, mid + 1, end);
			merge(arr, temp, start, mid, end);
		}
	}
	
	private void merge(int[] arr, int[] temp, int start, int mid, int end) {
		
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		
		int i = start;
		int j = mid + 1;
		int k = start;
		
		
		while (i <= mid && j <= end) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			}
			else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			arr[k] = temp[i];
			i++;
			k++;
		}
		
		while (j <= end) {
			arr[k] = temp[j];
			j++;
			k++;
		}
	}
	
	private int findMedian(int[] arr) {
	    // Write your code here
        int j = arr.length - 1;
        int number = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == j) {
               number = arr[i]; 
               break;
            }
            j--;
        }
        return number;
    }
}
