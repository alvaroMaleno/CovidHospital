
/**
 * Record the test and vaccine history of a patient.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 01/03/2021
 */

import java.util.LinkedList;

public class TestRecord
{
    // instance variables
    /**
     * List of users.
     */
    LinkedList<Test> tests;

    /**
     * Constructor for objects of class TestRecord
     */
    public TestRecord()
    {
        // initialise instance variables
        this.tests = new LinkedList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public LinkedList<Test> getTests()
    {
        return this.tests;
    }
}
