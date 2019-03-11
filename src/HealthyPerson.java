
public class HealthyPerson extends Person
{
    private String reason;
   
    public HealthyPerson(String name, int age, String reason)
    {
        super(name, age);
        this.reason = reason;
    }

    @Override
    protected int compareToImpl(Person p)
    {
        if (!this.getClass().equals(p.getClass())) {
            return 0;
        }
        else if (this.getName().compareTo(p.getName()) == 1) {
            return 1;
        }
        else if (this.getName().compareTo(p.getName()) == -1) {
            return -1;
        }
        else {
            return 0;
        }
    }
    private String getReason() {
        return this.reason;
    }

    @Override
    public String toString()
    {
        return String.format("%s In for %s", super.toString(), this.getReason());
    }
}
