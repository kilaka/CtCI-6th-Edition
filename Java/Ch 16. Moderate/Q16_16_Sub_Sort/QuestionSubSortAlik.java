package Q16_16_Sub_Sort;

public class QuestionSubSortAlik {

	public static void findUnsortedSequence(int[] array) {
		int left_index = findLeft(array);
		int right_index = findRight(array);

		if (validate(array, left_index, right_index)) {
			System.out.println("TRUE: " + left_index + " " + right_index);
		} else {
			System.out.println("FALSE: " + left_index + " " + right_index);
		}
	}

	private static int findRight(int[] nums) {
		int max = nums[0];
		int unsortedEdge = 0;
		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (num >= max) {
				max = num;
			} else {
				unsortedEdge = i;
			}
		}
		return unsortedEdge;
	}

	private static int findLeft(int[] nums) {
		int min = nums[nums.length-2];
		int unsortedEdge = nums.length-1;
		for (int i = nums.length-2; i >= 0; --i) {
			int num = nums[i];
			if (num <= min) {
				min = num;
			} else {
				unsortedEdge = i;
			}
		}
		return unsortedEdge;
	}

	/* Validate that sorting between these indices will sort the array. Note that this is not a complete
	 * validation, as it does not check if these are the best possible indices.
	 */
	public static boolean validate(int[] array, int left_index, int right_index) {
		int[] middle = new int[right_index - left_index + 1];
		for (int i = left_index; i <= right_index; i++) {
			middle[i - left_index] = array[i];
		}
		java.util.Arrays.sort(middle);
		for (int i = left_index; i <= right_index; i++) {
			array[i] = middle[i - left_index];
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i-1] > array[i]) {
				return false;
			}		
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
		findUnsortedSequence(array);
	}

}
