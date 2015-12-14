import java.util.Arrays;
public class ArrayOperations2
{
    private int[] values;
    public void ArrayMethods(int[] initialValues) 
    {   
        values = initialValues;
    }
    public void swapFirstAndLast()
    {
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
            
        int first = values[0];
        values[0]= values[values.length-1];
        values[values.length-1]=first;
        
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
    }
    public void shiftRight()
    {
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
        
        values[0] = values[values.length-1];
        for (int i = 1 ; i<values.length ; i++ )
        {
            values[i] = values[i-1];
        }
        
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
    }
    public void zero()
    {
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
        for (int i=0;i<values.length;i++)
            if (values[i]%2==0)
                values[i]=0;
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
    }
    public void neighbors()
    {
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
        for (int i=1;i<values.length-1;i++)
            if (values[i-1] > values[i+1])
                values[i] = values[i-1];
            else
                values[i] = values[i+1];
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
    }
    public void middleRemove()
    {
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
        
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]);
    }
    public void evenFront()
    {
        
    }
    public void secondLargest()
    {
        
    }
    public void sorted()
    {
        
    }
    public void adjacentDuplicate()
    {
        
    }
    public void anyDuplicate()
    {
        
    }
}