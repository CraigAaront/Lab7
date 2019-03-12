import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author Aaron
 * QueueHospital organizes the patients by FIFO
 * @param <PatientType>
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> hospitalQueue;
    Iterator<PatientType> iterator;
    
    /**
     * constructor that constructs the deque object as a linkedlist, and an iterator
     */
    public QueueHospital() {
        hospitalQueue = new LinkedList<PatientType>();
    }
    
    /**
     * adds a patient to the queue
     */
    @Override
    public void addPatient(PatientType patient)
    {
        hospitalQueue.addLast(patient);
    }

    /**
     * finds and returns the next patient in the queue
     */
    @Override
    public PatientType nextPatient()
    {
        return hospitalQueue.peekFirst();
    }

    /**
     * finds, returns, and removes the next patient in the queue
     */
    @Override
    public PatientType treatNextPatient()
    {
        return hospitalQueue.removeFirst();
    }

    /**
     * returns the number of patients in the queue
     */
    @Override
    public int numPatients()
    {
        return hospitalQueue.size();
    }

    /**
     * returns "QueueHospital"
     */
    @Override
    public String hospitalType()
    {
        return "QueueHospital";
    }

    /**
     * returns the toStrings of all the patients
     */
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
