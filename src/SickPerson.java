
public class SickPerson extends Person
{

    public SickPerson(String name, int age)
    {
        super(name, age);
    }

    @Override
    protected int compareToImpl(Person p)
    {
        
        return 0;
    }

    @Override
    public String toString()
    {
        return "SickPerson";
    }
}
