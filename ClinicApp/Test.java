/**
 * Abstract class Prueba - Representation of a Test in an hospital
 * 
 * @author: Alvaro Maleno Alferez
 * Date: 28/02/2021
 */

import java.util.Date;

public class Test
{
    // instance variables
    /**
     * The unique identifier for a test. Only setable by constructor.
     */
    String id;
    /**
     * The date where the test were done.
     */
    Date date;
    /**
     * A numeric result of the test for positive and negative result.
     */
    int result;
    /**
     * A reference to the unique identifier of a Nurse. Only settable by 
     * constructor.
     */
    String nurseID;
    /**
     * A reference to the unique identifier of a LabTecnic. Only settable by
     * constructor.
     */
    String labTecnicID;
    /**
     * The type of a test: PCR, ANTIGEN, SEROLOGIC. Only settable by
     * constructor.
     */
    Type type;
    
    private Test(){}
    
    public Test (
    String id, 
    Date date, 
    int result, 
    String nurseID,
    String labTecnicID,
    Type type)
    {
        this.id = id;
        this.date = date;
        this.result = result;
        this.nurseID = nurseID;
        this.labTecnicID = labTecnicID;
        this.type = type;
    }
    
    /**
     * Get the Test unique identifier of a Test instance.
     * 
     * @param  No param
     * @return        ID of the test.
     */
    public String getId()
    {
       return this.id;
    }
    
    /**
     * Get the Date of a Test instance.
     * 
     * @param  No param
     * @return        Date of the test.
     */
    public Date getDate()
    {
       return this.date;
    }
    
     /**
     * Get the Result of a Test instance.
     * 
     * @param  No param
     * @return        Result of the test.
     */
    public int getResult()
    {
       return this.result;
    }
    
     /**
     * GSet the Result of a Test instance.
     * 
     * @param  int Result of a Test instance.
     * @return        Void.
     */
    public void setResult(int result)
    {
       this.result = result;
    }
    
      /**
     * Get the NurseID of a Test instance.
     * 
     * @param  No param
     * @return        NurseID of the test.
     */
    public String getNurseID()
    {
       return this.nurseID;
    }
    
     /**
     * Get the LabTecnicID of a Test instance.
     * 
     * @param  No param
     * @return        LabTecnicID of the test.
     */
    public String getLabTecnicID()
    {
       return this.labTecnicID;
    }
    
    /**
     * The type of a test: PCR, ANTIGEN, SEROLOGIC. Only settable by
     * constructor.
     */
    public static enum Type
    {
        ANTIGEN, PCR, SEROLOGIC
    }
}
