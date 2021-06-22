package com.epam.rd2021.q3.b1.BubbleSort;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()   
    {    	    	
    	assertTrue(Arrays.equals(new int[]{1,2,3,4,5,6,7,8,9}, new App().bubbleSort(new int[]{3,1,2,4,9,6,7,5,8}) ));
    }
}
