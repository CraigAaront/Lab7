import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
    
    PriorityQueue<PatientType> priorityHospital;
    public PriorityQueueHospital() {
        priorityHospital = new PriorityQueue<PatientType>();
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
