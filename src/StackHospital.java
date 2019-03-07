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
        // TODO Auto-generated method stub
        
    }

    @Override
    public PatientType nextPatient()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PatientType treatNextPatient()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int numPatients()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String hospitalType()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String allPatientInfo()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
