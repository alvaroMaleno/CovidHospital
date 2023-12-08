
/**
 * Record the test and vaccine history of a patient.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 01/03/2021
 */

import java.util.LinkedList;

public class Record
{
    // instance variables 
    /**
     * A list recorder of the tests done to a patient.
     */
    LinkedList<Test> testList;
    
    /**
     * A list recorder of the vaccines inoculated on a patient.
     */
    LinkedList<Vaccine> vaccineList;

    /**
     * Constructor for objects of class Record
     */
    public Record()
    {
        this.testList = new LinkedList<Test>();
        this.vaccineList = new LinkedList<Vaccine>();
    }

    /**
     * Add a new test to the patient test record list.
     * 
     * @param  test A test object.
     * @return     void
     */
    public void addTest(Test test)
    {
        this.testList.add(test);
    }
    
    /**
     * Add a new test to the patient test record list.
     * 
     * @param  No param.
     * @return     LinkedList<Test> A list within all the tests done to a 
     * patient.
     */
    public LinkedList<Test> getTestList()
    {
        return this.testList;
    }
    
     /**
     * Add a new vaccine to the patient vaccine record list.
     * 
     * @param  vaccine A vaccine object.
     * @return     void
     */
    public void addVaccine(Vaccine vaccine)
    {
        this.vaccineList.add(vaccine);
    }
    
    /**
     * Get the vaccine list.
     * 
     * @param  No param.
     * @return     LinkedList<Vaccine> A list within all the vaccines 
     * inoculated to a patient.
     */
    public LinkedList<Vaccine> getVaccineList()
    {
        return this.vaccineList;
    }
}
