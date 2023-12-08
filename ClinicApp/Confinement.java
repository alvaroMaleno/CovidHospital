
/**
 * A class to represent a patient confinement.
 * 
 * @author Alvaro Maleno Alferez 
 * @version 01/03/2021
 */

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Confinement
{
    // instance variables
    /**
     * A moment that represent when a patien begins the confinement.
     */
    private Date startDate;

    /**
     * A moment that represent when a patien ends the confinement.
     */
    private Date endDate;
    
    /**
     * Constructor for objects of class Confinement without params avoided.
     */
    private Confinement(){}
    
    /**
     * Constructor for objects of class Confinement
     */
    public Confinement(Date startDate, Date endDate)
    {
        // initialise instance variables
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /**
     * Constructor for objects of class Confinement
     */
    public Confinement(Date startDate, int numberOfDays)
    {
        // initialise instance variables
        this.startDate = startDate;
        this.endDate = 
        new Date(startDate.getTime() + 
        numberOfDays * (1000 * 60 * 60 * 24));
    }

    /**
     * Get the start date of a confinement.
     * 
     * @param  No params.
     * @return     The start Date of a confinement. 
     */
    public Date getStartDate()
    {
        return this.startDate;
    }
    
    /**
     * Get the end date of a confinement.
     * 
     * @param  No params.
     * @return     The end Date of a confinement. 
     */
    public Date getEndDate()
    {
        return this.endDate;
    }
    
    /**
     * Get the number of days of confinement.
     * 
     * @param  No params.
     * @return     The number of days of confinement. 
     */
    public int getConfinementDays()
    {
        return this.getDaysDiff(this.startDate, this.endDate);
    }
    
    /**
     * Get the number of days of confinement wasted.
     * 
     * @param  No params.
     * @return     The number of days of confinement wasted. 
     */
    public int getDaysFromConfinementStart()
    {
        return this.getDaysDiff(this.startDate, new Date());
    }
    
    /**
     * Get the number of days until the end of confinement.
     * 
     * @param  No params.
     * @return     The number of days until the end of confinement. 
     */
    public int getDaysToConfinementEnd()
    {
        return this.getDaysDiff(new Date(), this.endDate);
    }
    
    /**
     * Get the number of days from date to date.
     * 
     * @param  No params.
     * @return     The number of days from date to date. 
     */
    private int getDaysDiff(Date fromDate, Date toDate)
    {
        long diff = toDate.getTime() - fromDate.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
