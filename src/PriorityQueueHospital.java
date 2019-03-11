import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
    
    PriorityQueue<PatientType> priorityHospital;
    Iterator<PatientType> iterator;
    
    public PriorityQueueHospital() {
        priorityHospital = new PriorityQueue<PatientType>();
        iterator = priorityHospital.iterator();
    }
    
    @Override
    public void addPatient(PatientType patient)
    {
        priorityHospital.add(patient);
    }

    @Override
    public PatientType nextPatient()
    {
        return priorityHospital.peek();
    }

    @Override
    public PatientType treatNextPatient()
    {
        return priorityHospital.poll();
    }

    @Override
    public int numPatients()
    {
        return priorityHospital.size();
    }

    @Override
    public String hospitalType()
    {
        return "PriorityHospital";
    }

    @Override
    public String allPatientInfo()
    {
        String output = "";
        for (iterator = priorityHospital.iterator(); iterator.hasNext(); ) {
            output += iterator.next().toString();
        }
        return output;
    }

}
