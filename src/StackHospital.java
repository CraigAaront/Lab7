import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * 
 * @author Aaron
 * StackHospital that orders patients by LIFO
 * @param <PatientType>
 */
public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> stackQueue;
    Iterator<PatientType> iterator;
    
    /**
     * constructor creates a deque as a linkedlist
     */
    public StackHospital() {
        stackQueue = new LinkedList<PatientType>();
    }
    
    /**
     * adds a patient to the queue
     */
    @Override
    public void addPatient(PatientType patient)
    {
        stackQueue.addFirst(patient);   
    }

    /**
     * finds and returns the next patient in the queue
     */
    @Override
    public PatientType nextPatient()
    {
        return stackQueue.peekFirst();
    }

    /**
     * finds, returns, and removes the next patient in the queue
     */
    @Override
    public PatientType treatNextPatient()
    {
        return stackQueue.removeFirst();
    }

    /**
     * returns the number of patients in the queue
     */
    @Override
    public int numPatients()
    {
        return stackQueue.size();
    }

    /**
     * returns "StackHospital"
     */
    @Override
    public String hospitalType()
    {
        return "StackHospital";
    }

    /**
     * returns the toStrings of all the patients, concatenated
     */
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
