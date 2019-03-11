import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> stackQueue;
    Iterator<PatientType> iterator;
    
    public StackHospital() {
        stackQueue = new LinkedList<PatientType>();
    }
    
    @Override
    public void addPatient(PatientType patient)
    {
        stackQueue.addFirst(patient);   
    }

    @Override
    public PatientType nextPatient()
    {
        return stackQueue.peekFirst();
    }

    @Override
    public PatientType treatNextPatient()
    {
        return stackQueue.removeFirst();
    }

    @Override
    public int numPatients()
    {
        return stackQueue.size();
    }

    @Override
    public String hospitalType()
    {
        return "StackHospital";
    }

    @Override
    public String allPatientInfo()
    {
        String output = "";
        for (iterator = stackQueue.iterator(); iterator.hasNext(); ) {
            output += iterator.next().toString();
        }
        return output;
    }

}
