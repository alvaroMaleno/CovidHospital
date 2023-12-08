
/**
 * Record the test and vaccine history of a patient.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 01/03/2021
 */

import java.util.LinkedList;

public class VaccineRecord
{
    // instance variables
    /**
     * List of vaccines.
     */
    LinkedList<Vaccine> vaccines;

    /**
     * Constructor for objects of class VaccineRecord
     */
    public VaccineRecord()
    {
        // initialise instance variables
        this.vaccines = new LinkedList<>();
    }

    /**
     * Get the list of vaccines.
     * 
     * @param  No Param
     * @return     List of vaccines
     */
    public LinkedList<Vaccine> getVaccines()
    {
        return this.vaccines;
    }
}
