import java.util.PriorityQueue;
import java.util.Iterator;

/**
 * 
 * @author Aaron
 * PriorityQueueHospital class orders by the natural ordering of the patientType
 * @param <PatientType>
 */
public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
    /**
     * Initializes an interator and hospital
     */
    PriorityQueue<PatientType> priorityHospital;
    Iterator<PatientType> iterator;

    /**
     * sets iterator and queue
     */
    public PriorityQueueHospital() {
        priorityHospital = new PriorityQueue<PatientType>();
    }
    
    /**
     * addes a patient to the queue
     */
    @Override
    public void addPatient(PatientType patient)
    {
        priorityHospital.add(patient);
    }

    /**
     * finds the next patient in queue and returns it
     */
    @Override
    public PatientType nextPatient()
    {
        return priorityHospital.peek();
    }

    /**
     * finds and removes the next patient in queue
     */
    @Override
    public PatientType treatNextPatient()
    {
        return priorityHospital.poll();
    }

    /**
     * returns the number of patients in the queue
     */
    @Override
    public int numPatients()
    {
        return priorityHospital.size();
    }

    /**
     * returns "PriorityQeueueHospital"
     */
    @Override
    public String hospitalType()
    {
        return "PriorityQueueHospital";
    }

    /**
     * returns the toStrings of all the patients
     */
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
