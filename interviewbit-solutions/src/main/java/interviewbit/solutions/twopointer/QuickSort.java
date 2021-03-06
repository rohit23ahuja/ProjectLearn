package interviewbit.solutions.twopointer;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] arr = { 234, 6, 3, 71, 86, 26 };
		quickSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(Integer[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(Integer[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p ,r);
			quickSort(arr,0 , q-1);
			quickSort(arr,q+1 , r);
		}
	}

	private static int partition(Integer[] arr, int p, int r) {
		int pivotValue = arr[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (arr[j]<=pivotValue) {
				i++;
				swap(arr, i ,j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}

	private static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
