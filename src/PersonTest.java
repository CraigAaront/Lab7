
import org.junit.Assert;
import org.junit.Test;
public class PersonTest
{
    @Test
    public void sickPersonTest() {
        Person sicko = new SickPerson("sickomode", 12, 1);
        Person sicko2 = new SickPerson("sickomode2", 13, 2);
        Person sicko3 = new SickPerson("sico", 13, 1);
        Person normie = new HealthyPerson("normine", 13, "Reason");
        
        Assert.assertEquals("getName is incorrect", "sickomode", sicko.getName());
        Assert.assertEquals("Getage is incorrect", 12, sicko.getAge());
        Assert.assertEquals("comparetoImpl incorrect", 1, sicko.compareTo(sicko2));
        Assert.assertEquals("comparetoImpl incorrect", -1, sicko2.compareTo(sicko));
        Assert.assertEquals("comparetoImpl incorrect", 0, sicko.compareTo(sicko3));
        Assert.assertEquals("comparetoImpl incorrect", 0, sicko.compareTo(normie));
        Assert.assertEquals("toString incorrect", "sickomode, a 12-year old. Severity level 1", sicko.toString());
    }
}
