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
        for (int i = 0; i < priorityHospital.size(); i++) {
            output += priorityHospital.toString();
        }
        return output;
    }

}
