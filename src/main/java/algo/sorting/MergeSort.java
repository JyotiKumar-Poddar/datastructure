package algo.sorting;

/**
 * Implementation of merge sorting algorithm. Technique based on <b>divide and
 * conquer</b> technique. Time complexity:<b> Ο(n log n)</b>
 * 
 * @author jyotipoddar
 *
 */
public class MergeSort {

	public void mergeSort(int[] input) {
		int size = input.length;
		if (size == 1) {
			return;
		}
		int mid = size / 2;

		int[] leftArray = new int[mid];
		int[] rightArray = new int[size - mid];

		// copy the array element to left sub array
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = input[i];
		}
		// copy the array element to right sub array
		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = input[j + mid];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, input);

	}

	public void merge(int[] leftArray, int[] rightArray, int[] input) {

		int i = 0;
		int j = 0;
		int k = 0;
		// int[] input = { 0, 0, 0, 00, 000, 0, 0, 0, 100 };
		int leftArrayLength = leftArray.length;
		int rightArrayLength = rightArray.length;

		while (i < leftArrayLength && j < rightArrayLength) {
			// compare the sub array and copy to the main array
			if (leftArray[i] < rightArray[j]) {
				input[k] = leftArray[i];
				i++;
			} else {
				input[k] = rightArray[j];
				j++;
			}
			k++;
		}
		// copy the remaining element to main array
		while (i < leftArrayLength) {
			input[k] = leftArray[i];
			i++;
			k++;

		}
		// copy the remaining element to main array
		while (j < rightArrayLength) {
			input[k] = rightArray[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {

		int[] input = { 0, -1, -4, 100, 33, 11, 66, 123, 90 };

		new MergeSort().mergeSort(input);
		for (int i : input) {
			System.out.println(i);
		}
	}

}
