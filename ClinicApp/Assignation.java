
/**
 * Class to represent an assignation of a test or a vaccine to a patient.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 15/03/2021
 */

import java.util.Date;

public class Assignation
{
    // instance variables
    /**
     * Patient identifier.
     */
    String  patientID;

    /**
     * Date of the assignation.
     */
    Date  date;
    
     /**
     * Type of the assignation. TEST or VACCINE.
     */
    Type  type;
    
     /**
     * ID of the Test or Vaccine assigned.
     */
    String  assignationID;
    
    /**
     * Constructor for objects of class Assignation. Only with params
     */
    private Assignation()
    {
    }
    
    /**
     * Constructor for objects of class Assignation. Only with params
     */
    public Assignation(
    String patientID, 
    String assignationID, 
    Date date, 
    Type type)
    {
        this.patientID = patientID;
        this.date = date;
        this.type = type;
        this.assignationID = assignationID;
    }

    /**
     * Get the patient id to whom the assignation is assigned.
     * 
     * @param  No param.
     * @return     Patient Identifier. 
     */
    public String getPatient()
    {
        return this.patientID;
    }
    
    /**
     * Set the patient id to whom the assignation is assigned.
     * 
     * @param  Patient identifier.
     * @return     void 
     */
    public void setPatient(String patientID)
    {
        this.patientID = patientID;
    }
    
    /**
     * Get the date of the assignement.
     * 
     * @param  No param.
     * @return     Assignement's date. 
     */
    public Date getDate()
    {
        return this.date;
    }
    
     /**
     * Set the date of the assignement.
     * 
     * @param  Date of the assignement.
     * @return     void 
     */
    public void setDate(Date date)
    {
        this.date = date;
    }
    
    /**
     * Get the type of the assignement.
     * 
     * @param  No param.
     * @return     Assignement's Type. 
     */
    public Type getType()
    {
        return this.type;
    }
    
     /**
     * Set the type of the assignement.
     * 
     * @param  Type of the assignement.
     * @return     void 
     */
    public void setDate(Type type)
    {
        this.type = type;
    }
    
     /**
     * Type of the assignation. TEST or VACCINE.
     */
    public enum Type{
        TEST, VACCINE;
    }
    
}
