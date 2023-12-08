/**
 * Represent a data record of users in an hospital system..
 * 
 * @author Alvaro Maleno Alferez
 * @version 18/03/2021
 */
import java.util.LinkedList;

public class Assignations
{
    // instance variables
     /**
     * List of assignations.
     */
    LinkedList<Assignation> assignations;

    /**
     * Constructor for objects of class Assignations
     */
    public Assignations()
    {
        // initialise instance variables
        this.assignations = new LinkedList<>();
    }

    /**
     * Get the assignation list.
     * 
     * @param  No param
     * @return     Assignation list. 
     */
    public LinkedList<Assignation> getAssignations()
    {
        // put your code here
        return this.assignations;
    }
}
