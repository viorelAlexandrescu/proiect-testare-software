package main;

public final class SearchMethods {

	/**
	 * Set L to 0 and R to n − 1. If L > R, the search terminates as unsuccessful.
	 * Set m (the position of the middle element) to the floor (the largest previous
	 * integer) of L + (R − L) / 2.. If Am < T, set L to m + 1 and go to step 2. If
	 * Am > T, set R to m − 1 and go to step 2. Now Am = T, the search is done;
	 * return m.
	 */
	public final static int binarySearch(int target, int[] array) {
		int leftEnd = 0;
		int rightEnd = array.length - 1;
		while (leftEnd <= rightEnd) {
			int middle = Math.floorDiv(leftEnd + (rightEnd - leftEnd), 2);

			// Check if x is present at mid
			if (array[middle] == target)
				return middle;

			// If x greater, ignore left half
			if (array[middle] < target)
				leftEnd = middle + 1;

			// If x is smaller, ignore right half
			else
				rightEnd = middle - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	public static String solve(int[] array, int target) {
		if (array == null)
			return "Array cannot be null";

		if (array.length == 0)
			return "Array cannot be empty.";

		if (array.length > 20)
			return "Array is too big.";
		
		int i;
		switch (i = binarySearch(target, array)) {
		case -1:
			return "Target not found";
		default:
			return String.format("Element is at index %d", i);
		}
	}
	
	//TODO implement doContinue flow in solve method
}
