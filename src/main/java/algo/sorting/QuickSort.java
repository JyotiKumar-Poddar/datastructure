package algo.sorting;

/**
 *  Java based Implementation of Quick Sort using recursion   
 * @author jyotipoddar
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 7, 2, 1, 6, 8, 5, 3, 4 ,-9};
		QuickSort quickSort = new QuickSort();
		int start = 0;
		int end = a.length - 1;
		quickSort.quicKSort(a, start, end);
		for (int i : a) {
			System.out.printf("%d ", i);
		}
	}

	// Quick sort function the call recursively
	private void quicKSort(int[] a, int start, int end) {
		if (start < end) {
			int partionIndex = partion(a, start, end);
			quicKSort(a, start, partionIndex - 1);
			quicKSort(a, partionIndex + 1, end);
		}

	}

	// Function for partition the array
	private int partion(int[] a, int start, int end) {
		int pivot = a[end]; // Set Pivot always as a right element
		int pIndex = start; // Set partition index as left initially
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				swap(a, i, pIndex); // Swap the element is lesser or equal then
									// pivot
				pIndex++; // Increment the pivot to new position
			}
		}
		swap(a, pIndex, end); // Swap the Pivot at the end 
		return pIndex; // Return the new partition index
	}

	// Function to swap the elements
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
