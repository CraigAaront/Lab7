import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> hospitalQueue;
    Iterator<PatientType> iterator;
    
    public QueueHospital() {
        hospitalQueue = new LinkedList<PatientType>();
        iterator = hospitalQueue.iterator();
    }
    
    @Override
    public void addPatient(PatientType patient)
    {
        hospitalQueue.addLast(patient);
    }

    @Override
    public PatientType nextPatient()
    {
        return hospitalQueue.peekFirst();
    }

    @Override
    public PatientType treatNextPatient()
    {
        return hospitalQueue.removeFirst();
    }

    @Override
    public int numPatients()
    {
        return hospitalQueue.size();
    }

    @Override
    public String hospitalType()
    {
        return "QueueHospital";
    }

    @Override
    public String allPatientInfo()
    {
        String output = "";
        for (iterator = hospitalQueue.iterator(); iterator.hasNext(); ) {
            output += iterator.next().toString();
        }
        return output;
    }

}
