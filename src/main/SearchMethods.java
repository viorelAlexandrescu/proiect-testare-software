package main;

public final class SearchMethods {

	/**
	 * Set L to 0 and R to n − 1. 
	 * If L > R, the search terminates as unsuccessful.
	 * Set m (the position of the middle element) to the floor (the largest previous
	 * integer) of L + (R − L) / 2.. 
	 * If Am < T, set L to m + 1 and go to step 2. 
	 * If Am > T, set R to m − 1 and go to step 2. Now Am = T, the search is done; return m.
	 */
	public final static int binarySearch(int target, int[] array) {
		if(array == null)
			throw new NullPointerException("Array cannot be null");
		
		int leftEnd = 0;
		int rightEnd = array.length -1;
		while (leftEnd <= rightEnd)
	    {
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
}
