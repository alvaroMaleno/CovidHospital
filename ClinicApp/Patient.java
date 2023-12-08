
/**
 * A Patient object to represent a patient of a clinic.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 08/03/2021
 */

import java.util.Date;

public class Patient extends Person
{
    // instance variables
    /**
     * Record of a Patient. Created by Constructor.
     */
    private Record record;
    /**
     * Confinement of a Patient. Null by default.
     */
    private Confinement confinement;
   
    /**
     * Constructor for objects of class Patient. It calls to Person's Constructor.
     */
    public Patient(
    String id, 
    String name, 
    String surname, 
    String nif, 
    int phone)
    {
        super(id, name, surname, nif, phone);
        this.record = new Record();
    }

    /**
     * Get the Record of a Patient
     * 
     * @param  No Param
     * @return     The Record of a patient. 
     */
    public Record getRecord()
    {
        return this.record;
    }
    
     /**
     * Get the Confinement of a Patient
     * 
     * @param  No Param
     * @return     The Confinement of a patient. 
     */
    public Confinement getConfinement()
    {
        return this.confinement;
    }
    
    /**
     * Get if a Patient is Confined or not.
     * 
     * @param  No Param
     * @return     If a Patient is confined or not. 
     */
    public boolean isConfined()
    {
        if(this.confinement == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    /**
     * Confine to a Patient from StartDate to EndDate.
     * 
     * @param  Date startDate from a Confinement, Date endDate from a Confinement
     * @return     void. 
     */
    public void confine(Date startDate, Date endDate)
    {
        this.confinement = new Confinement(startDate, endDate);
    }
    
    /**
     * Confine to a Patient from StartDate for a number of days.
     * 
     * @param  Date startDate from a Confinement, duration on days of the 
     * Confinement.
     * @return     void. 
     */
    public void confine(Date startDate, int numberOfDays)
    {
        this.confinement = new Confinement(startDate, numberOfDays);
    }
    
    /**
     * Unconfine to a Patient.
     * 
     * @param  NoParam
     * @return     void. 
     */
    public void unconfine()
    {
        this.confinement = null;
    }
    
}
