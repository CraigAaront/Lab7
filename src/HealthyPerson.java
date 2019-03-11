
public class HealthyPerson extends Person
{

    public HealthyPerson(String name, int age)
    {
        super(name, age);
    }

    @Override
    protected int compareToImpl(Person p)
    {
        if (this.getName().charAt(0) > p.getName().charAt(0)) {
            return 1;
        }
        else if (this.getName().charAt(0) < p.getName().charAt(0)) {
            return -1;
        }
        else {
            return 0;
        }
    }
        

    @Override
    public String toString()
    {
        return "HealthyPerson";
    }
}
