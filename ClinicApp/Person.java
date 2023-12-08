/**
 * Abstract class Persona - Reperesent personal data about diferent memebers 
 * in an hospital
 * 
 * @author: Alvaro Maleno   
 * Date: 28/02/2021
 */
public abstract class Person
{
    // instance variables
    /**
     * System unique identifier of a Person. Only modified by Constructor.
     */
    String id;
    /**
     * Name of a Person
     */
    String name;
    /**
     * Surname of a Person
     */
    String surname;
    /**
     * NIF of a Person
     */
    String nif;
    /**
     * Phone of a Person
     */
    int phone;
    
    
    public Person(
    String id, 
    String name, 
    String surname, 
    String nif, 
    int phone)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.phone = phone;
    }
    
    /**
     * Get the name of Person instance
     *
     * @param      No param
     * @return     Name of the Person instance
     */
    public String getName()
    {
        return this.name;
    }

    
    /**
     * Modify the name of Person instance 
     * @param  name  Name of Person instance
     * @return        void
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Get the surname of Person instance
     *
     * @param      No param
     * @return     Surname of the Person instance
     */
    public String getSurname()
    {
        return this.surname;
    }

    
    /**
     * Modify the surname of Person instance 
     * @param  surname  Surname of a person
     * @return        void
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
     /**
     * Get the NIF of Person instance
     *
     * @param      No param
     * @return     NIF of the Person instance
     */
    public String getNif()
    {
        return this.nif;
    }

    
    /**
     * Modify the NIF of Person instance 
     * @param  nif  NIF of Person instance
     * @return        void
     */
    public void setNif(String nif)
    {
        this.surname = surname;
    }
    
     /**
     * Get the Phone of Person instance
     *
     * @param      No param
     * @return     Phone of the Person instance
     */
    public int getPhone()
    {
        return this.phone;
    }

    
    /**
     * Modify the phone of Person instance 
     * @param  phone  Phone of a person
     * @return        void
     */
    public void setPhone(int phone)
    {
        this.phone = phone;
    }
}
