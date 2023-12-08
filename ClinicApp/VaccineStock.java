
/**
 * Represent the stock of vaccines in an hospital.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 01/03/2021
 */
import java.util.LinkedList;

public class VaccineStock
{
    // instance variables
     /**
     * Stock of vaccines.
     */
    LinkedList<Vaccine> vaccines;

    /**
     * Constructor for objects of class VaccineStock
     */
    public VaccineStock()
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
