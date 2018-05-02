package main;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public final class Tests {

	private int[] smallEnoughArray = { 5 };
	private int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private int[] bigEnoughArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

	/**
	 * Functional Testing
	 */

	@Test
	public void equivalencePartitioning() {
		assertEquals(SearchMethods.ARRAY_EMPTY_OR_NULL, SearchMethods.solve(null, new Random().nextInt()));
		assertEquals(SearchMethods.ARRAY_EMPTY_OR_NULL, SearchMethods.solve(new int[0], new Random().nextInt()));
		assertEquals(SearchMethods.ARRAY_SIZE_TOO_BIG, SearchMethods.solve(new int[25], new Random().nextInt()));
		assertEquals("1", SearchMethods.solve(array, 1));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(array, -1));
	}

	@Test
	public void boundaryValueAnalysis() {
		assertEquals(SearchMethods.ARRAY_EMPTY_OR_NULL, SearchMethods.solve(new int[0], new Random().nextInt()));
		assertEquals(SearchMethods.ARRAY_SIZE_TOO_BIG, SearchMethods.solve(new int[21], new Random().nextInt()));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(smallEnoughArray, 1));
		assertEquals("0", SearchMethods.solve(smallEnoughArray, 5));
		assertEquals("19", SearchMethods.solve(bigEnoughArray, 19));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(bigEnoughArray, 20));
	}

	@Test
	public void categoryPartitioning() {
		assertEquals(SearchMethods.ARRAY_EMPTY_OR_NULL, SearchMethods.solve(null, new Random().nextInt()));
		assertEquals(SearchMethods.ARRAY_EMPTY_OR_NULL, SearchMethods.solve(new int[0], new Random().nextInt()));
		
		assertEquals("0", SearchMethods.solve(smallEnoughArray, 5));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(smallEnoughArray, 1));
		
		assertEquals("0", SearchMethods.solve(array, 0));
		assertEquals("9", SearchMethods.solve(array, 9));
		assertEquals("4", SearchMethods.solve(array, 4));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(array, 10));
		
		assertEquals("0", SearchMethods.solve(bigEnoughArray, 0));
		assertEquals("19", SearchMethods.solve(bigEnoughArray, 19));
		assertEquals("9", SearchMethods.solve(bigEnoughArray, 9));
		assertEquals(SearchMethods.TARGET_NOT_FOUND, SearchMethods.solve(array, 20));
		
		assertEquals(SearchMethods.ARRAY_SIZE_TOO_BIG, SearchMethods.solve(new int[21], new Random().nextInt()));
		assertEquals(SearchMethods.ARRAY_SIZE_TOO_BIG, SearchMethods.solve(new int[100_000], new Random().nextInt()));
	}

	/**
	 * Structural testing
	 */
	@Test
	public void statementCoverage() {

	}

	@Test
	public void branchCoverage() {

	}

	@Test
	public void conditionCoverage() {

	}

	/**
	 * Path coverage
	 */
	@Test
	public void pathCoverage() {

	}
}
