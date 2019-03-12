/**
 * 
 * @author Aaron
 * Sickperson class that creates a sickperson with name, age, and severity
 */
public class SickPerson extends Person
{
    
    private int severity;
    /**
     * constructor that constructs a person object
     * @param name: person name
     * @param age: person age
     * @param severity: sickperson severity
     */
    public SickPerson(String name, int age, int severity)
    {
        super(name, age);
        this.severity = severity;
    }
    
    /**
     * returns the patients severity
     * @return
     */
    private int getSeverity() {
        return this.severity;
    }

    /**
     * compares persons based on severity; if the person is not a sickperson, returns 0; else it returns -1 if
     * this severity > person severity, 1 if this severity < person severity, and 0 if they are equal
     */
    @Override
    protected int compareToImpl(Person p)
    {
        if (!this.getClass().equals(p.getClass())) {
            return 0;  
        }
        else if(this.getSeverity() > ((SickPerson) p).getSeverity()) {
            return -1;
        }
        else if(this.getSeverity() < ((SickPerson) p).getSeverity()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    /**
     * returns the toString in form of "%s Severity level %d"
     */
    @Override
    public String toString()
    {
        return String.format("%s Severity level %d", super.toString(), this.getSeverity());
    }
}
