
/**
 * Represent a data record of users in an hospital system..
 * 
 * @author Alvaro Maleno Alferez
 * @version 18/03/2021
 */
import java.util.LinkedList;

public class UserRecord
{
    // instance variables
    /**
     * List of users.
     */
    LinkedList<Person> users;

    /**
     * Constructor for objects of class UserRecord
     */
    public UserRecord()
    {
        // initialise instance variables
        this.users = new LinkedList<>();
    }

    /**
     * Get the user list.
     * 
     * @param  No param
     * @return     Users list. 
     */
    public LinkedList<Person> getUsers()
    {
        // put your code here
        return this.users;
    }
}
