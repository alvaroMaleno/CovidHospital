
/**
 * Representation of a sanitary personal. Nurse or Tecnic type.
 * 
 * @author Alvaro Maleno Alferez
 * @version 15/03/2021
 */
import java.util.LinkedList;

public class Sanitary extends Person
{
    // instance variables
    /**
     * List of assignements.
    */
    private LinkedList<Assignation> assignements;
    /**
     * Type of sanitary. NURSE or TECNIC.
    */
    private Type type;

    /**
     * Constructor for objects of class Sanitary.
     */
    public Sanitary(
    String id, 
    String name, 
    String surname, 
    String nif, 
    int phone,
    Type type)
    {
        super(id, name, surname, nif, phone);
        this.assignements = new LinkedList<>();
        this.type = type;
    }

   /**
     * Get assignements of a sanitary.
     * 
     * @param  No params.
     * @return     Assignements List of a sanitary. 
     */
    public LinkedList<Assignation> getAssignements()
    {
        return this.assignements;
    }
    
   /**
     * Get the type of a sanitary.
     * 
     * @param  No params.
     * @return     Type of a sanitary. 
   */
   public Type getType()
   {
       return this.type;
   }
   
    /**
     * Set the type of a sanitary.
     * 
     * @param  Type.
     * @return   void
     */
    public void setType(Type type)
    {
        this.type = type;
    }
    
    /**
     * Type of sanitary. NURSE or TECNIC.
    */
    public enum Type{
        NURSE, TECNIC;
    }
    
}
