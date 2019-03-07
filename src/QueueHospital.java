import java.util.Deque;
import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{

    private Deque<PatientType> hospitalQueue;
    
    public QueueHospital() {
        hospitalQueue = new LinkedList<PatientType>();
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
        for(int i = 0; i < hospitalQueue.size(); i++) {
            output += ((LinkedList<PatientType>) hospitalQueue).get(i).toString();
        }
        return output;
    }

}
