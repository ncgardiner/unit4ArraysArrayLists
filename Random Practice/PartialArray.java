/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;
    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        this.values=new int[100];
        for (currentSize=0;
             currentSize<20;
             currentSize++)
        {
            values[currentSize]=currentSize*currentSize;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void remove (int pos)
    {
        // put your code here
        for (int i = pos+1; i<currentSize; i++)
        {
            this.values[i-1] = this.values[i];
        }
        currentSize--;
    }
}
