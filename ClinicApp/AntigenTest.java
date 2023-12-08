
/**
 * Representation of an Antigen test in a hospital.
 * 
 * @author Alvaro Maleno Alferez
 * @version 18/03/2021
 */
import java.util.Date;

public class AntigenTest extends Test
{
    // instance variables
    boolean isFast;

    /**
     * Constructor for objects of class AntigenTest
     */
    public AntigenTest(
    String id, 
    Date date, 
    int result, 
    String nurseID,
    String labTecnicID,
    Type type,
    boolean isFast)
    {
        super(id, date,result,nurseID,labTecnicID, type);
        this.isFast = isFast;
    }

    /**
     * Check if is a fast antigen test or not.
     * 
     * @param  No param
     * @return     True if it is fast and False if it is not.
     */
    public boolean isFast()
    {
        return this.isFast;
    }
}
