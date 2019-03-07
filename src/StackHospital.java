import java.util.Deque;
import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> stackQueue;
    
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
        return stackQueue.peekLast();
    }

    @Override
    public PatientType treatNextPatient()
    {
        return stackQueue.removeLast();
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
        for (int i = 0; i < stackQueue.size(); i++) {
            output += ((LinkedList<PatientType>) stackQueue).get(i).toString();
        }
        return output;
    }

}
