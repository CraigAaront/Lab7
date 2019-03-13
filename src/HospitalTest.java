
import org.junit.Assert;
import org.junit.Test;
public class HospitalTest
{
    @Test
    public void testQueueHospital() {
        Hospital<Person> queue = new QueueHospital<Person>();
        Person one = new SickPerson("one", 1, 1);
        Person two = new SickPerson("two", 2, 2);
        queue.addPatient(one);
        queue.addPatient(two);
        
        
        Assert.assertEquals("nextPatient is incorrect", one, queue.nextPatient());
        Assert.assertEquals("treatNextPatient is incorrect", one, queue.treatNextPatient());
        Assert.assertEquals("numpatients is incorrect", 1, queue.numPatients());
        Assert.assertEquals("hospitalType incorrect", "QueueHospital", queue.hospitalType());
        Assert.assertEquals("Allpatientinfo incorrect", "two, a 2-year old. Severity level 2", queue.allPatientInfo());
        Assert.assertEquals("toString incorrect", "A QueueHospital-type hospital with 1 patients.", queue.toString());
    }
    
    @Test
    public void testStackHospital() {
        Hospital<Person> queue = new StackHospital<Person>();
        Person one = new SickPerson("one", 1, 1);
        Person two = new SickPerson("two", 2, 2);
        queue.addPatient(one);
        queue.addPatient(two);
        
        Assert.assertEquals("nextPatient is incorrect", two, queue.nextPatient());
        Assert.assertEquals("treatNextPatient is incorrect", two, queue.treatNextPatient());
        Assert.assertEquals("numpatients is incorrect", 1, queue.numPatients());
        Assert.assertEquals("hospitalType incorrect", "StackHospital", queue.hospitalType());
        Assert.assertEquals("Allpatientinfo incorrect", "one, a 1-year old. Severity level 1", queue.allPatientInfo());
        Assert.assertEquals("toString incorrect", "A StackHospital-type hospital with 1 patients.", queue.toString());

    }
    @Test
    public void testPriorityHospital() {
        Hospital<Person> queue = new PriorityQueueHospital<Person>();
        Person one = new SickPerson("one", 1, 1);
        Person two = new SickPerson("two", 2, 2);
        Person three = new SickPerson("three", 1, 3);
        queue.addPatient(one);
        queue.addPatient(three);
        queue.addPatient(two);
        
        Assert.assertEquals("nextPatient is incorrect", three, queue.nextPatient());
        Assert.assertEquals("treatNextPatient is incorrect", three, queue.treatNextPatient());
        Assert.assertEquals("numpatients is incorrect", 2, queue.numPatients());
        Assert.assertEquals("hospitalType incorrect", "PriorityQueueHospital", queue.hospitalType());
        Assert.assertEquals("Allpatientinfo incorrect", "two, a 2-year old. Severity level 2one, a 1-year old. Severity level 1", queue.allPatientInfo());
        Assert.assertEquals("toString incorrect", "A PriorityQueueHospital-type hospital with 2 patients.", queue.toString());

    }
}
