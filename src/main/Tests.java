package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class Tests {
	
	/**
     * Functional Testing
     */

    @Test
    public void equivalencePartitioning() {
    	int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
    	assertEquals(new NullPointerException("Array cannot be null"), SearchMethods.binarySearch(7, null));
    	assertEquals(7, SearchMethods.binarySearch(7, testArray));
    }

    @Test
    public void boundaryValueAnalysis() {
       
    }

    @Test
    public void categoryPartitioning() {
       
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
     * Acoperirea la nivel de cale
     */
    @Test
    public void pathCoverage() {
       
    }


    @Test
    public void solveTest() {
        
    }
	
	public static void main(String[] args) {
		SearchMethods.binarySearch(0, new int[]{0, 1 ,2 ,3});
	}
}
