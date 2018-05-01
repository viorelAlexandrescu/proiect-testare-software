package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class Tests {
	
	/**
     * Functional Testing
     */

    @Test
    public void equivalencePartitioning() {
    	int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
    	assertEquals("Array cannot be null", SearchMethods.solve(array, 1));
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
     * Path coverage
     */
    @Test
    public void pathCoverage() {
       
    }
    
	
	public static void main(String[] args) {
		SearchMethods.binarySearch(0, new int[]{0, 1 ,2 ,3});
	}
}
