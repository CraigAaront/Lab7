/**
 * 
 * @author Aaron
 * HealthyPerson class that takes in a name, age, and reason; extends person class
 */
public class HealthyPerson extends Person
{
    private String reason;
   /**
    * constructor for healthy person
    * @param name: name of person
    * @param age: age of person
    * @param reason: persons reason for visit
    */
    public HealthyPerson(String name, int age, String reason)
    {
        super(name, age);
        this.reason = reason;
    }

    /**
     * compare method that orders based on person name; if the person is not a healthyperson, returns 0;
     * else it orders alphabetically based on name
     */
    @Override
    protected int compareToImpl(Person p)
    {
        if (!this.getClass().equals(p.getClass())) {
            return 0;
        }

            return this.getName().compareTo(p.getName());
    }
    /**
     * 
     * @return : reason of visit
     */
    private String getReason() {
        return this.reason;
    }

    /**
     * returns string in form of "%s In for %s"
     */
    @Override
    public String toString()
    {
        return String.format("%s In for %s", super.toString(), this.getReason());
    }
}
