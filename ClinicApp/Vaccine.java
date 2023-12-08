/**
 * Abstract class Vaccine - Vaccine Representation.
 * 
 * @author: Alvaro Maleno Alferez
 * Date: 28/02/2021
 */

import java.util.Date;

public class Vaccine
{
    // instance variables 
    /**
     * The unique identifier for a vaccine. Only setable by constructor.
     */
    String id;
    
    /**
     * The unique identifier of the person who is going to inoculate the
     * vaccine. Only setable by constructor.
     */
    String nurseID;
    
    /**
     * The dose number a vaccine must be inoculated.
     */
    int doseNumber;
    
    /**
     * The date of the first dose inoculation. 
     */
    Date firstDoseDate;
    
    /**
     * The date of the first dose inoculation. 
     */
    boolean isInoculated;
    
    /**
     * Type of the vaccine. PFIZER, MODERNA, JOHNSON&JOHNSON. 
     */
    Type type;


    private Vaccine(){}
    
    public Vaccine (
    String id, 
    String nurseID, 
    int doseNumber, 
    Date firstDoseDate,
    Type type)
    {
        this.id = id;
        this.nurseID = nurseID;
        this.doseNumber = doseNumber;
        this.firstDoseDate = firstDoseDate;
        this.isInoculated = false;
        this.type = type;
    }
    
    /**
     * Get the Vaccine unique identifier of a Vaccine instance.
     * 
     * @param  No param
     * @return        ID of the vaccine.
     */
    public String getId()
    {
       return this.id;
    }
    
     /**
     * Get the nurse's unique identifier of a Vaccine instance.
     * 
     * @param  No param
     * @return        NurseID of the vaccine.
     */
    public String getNurseID()
    {
       return this.nurseID;
    }
    
    /**
     * Get the Vaccine dose number of a Vaccine instance.
     * 
     * @param  No param
     * @return        Douse number of the vaccine.
     */
    public int getDoseNumber()
    {
       return this.doseNumber;
    }
    
    /**
     * Set the Vaccine dose number of a Vaccine instance.
     * 
     * @param  int Dose Number
     * @return        Void.
     */
    public void setDoseNumber(int doseNumber)
    {
       this.doseNumber = doseNumber;
    }
    
    /**
     * Get the Vaccine first inoculation date of a Vaccine instance.
     * 
     * @param  No param
     * @return        First dose inoculation date of the vaccine.
     */
    public Date getFirstDoseDate()
    {
       return this.firstDoseDate;
    }
    
     /**
     * Get if the Vaccine has been inoculated yet.
     * 
     * @param  No param
     * @return        True if it has been inoculated and False in opposite
     * case.
     */
    public boolean isInoculated()
    {
       return this.isInoculated;
    }
    
    /**
     * Inoculate the vaccine setting if the Vaccine has been inoculated yet.
     * 
     * @param  No param
     * @return      Void.
     */
    public void inoculate()
    {
       if(--this.doseNumber == 0){
           this.isInoculated = true;
        }
    }
    
    public static enum Type
    {
        PFIZER, MODERNA, JOHNSON;
    }
}
