package algo.searching;

/**
 * 
 * This binarSearch class will only work for integer value
 * 
 * <B>The input must be sorted in ascending order</B>
 * 
 * @author jyotipoddar
 *
 */
public class BinarySearch {
	int[] inputArray;
	int inputValue;

	BinarySearch() {

	}

	BinarySearch(int[] input, int value) {
		this.inputArray = input;
		this.inputValue = value;
	}

	public int[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}

	public int getInputValue() {
		return inputValue;
	}

	public void setInputValue(int inputValue) {
		this.inputValue = inputValue;
	}

	/**
	 * Method that return the index of search element.
	 * -1 in case of element not found
	 * else element found 
	 * 
	 * @return
	 */
	public int getSearchElemtnIndex() {
		int index = -1;
		// BinarySearch prerequisite is the input array should in sorted format
		// Implementation in iterative approach
		int left = 0;
		int right = inputArray.length-1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (inputArray[mid] == inputValue){
				index=mid;
				break;
			}
			if (inputArray[mid] < inputValue) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] input = { 4, 7, 9, 12, 17, 19, 24, 27 };
		int value = 17;
		BinarySearch bs = new BinarySearch(input, value);
		System.out.println(bs.getSearchElemtnIndex());
	}
	
}
