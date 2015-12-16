import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    /**
     * Tests if the thingy works 
     */
    public void testMonsterLocation()
    {
        //First Test
        Radar radar = new Radar(100,100);
        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        radar.setMonsterLocation(a,b);
        int largestRow = 0;
        int largestCol = 0;
        int largest = 0;
        for(int i=0; i<100;i++)
        {
            radar.scan();
        }
        for(int i=0; i<radar.getNumRows();i++)
            for(int j=0; j<radar.getNumCols(); j++)
            {
                if (radar.getAccumulatedDetection(i,j) > largest)
                {
                    largest= radar.getAccumulatedDetection(i,j);
                    largestRow = i;
                    largestCol = j;
                }
            }
            
        assertEquals(largestRow,a);
        assertEquals(largestCol,b);
    }
    @Test
    /**
     * Same as above just for giggles
     */
    public void testMonsterLocation2()
    {
        //Second Test
        Radar radar2 = new Radar(100,100);
        int a2 = (int) (Math.random()*100);
        int b2 = (int) (Math.random()*100);
        radar2.setMonsterLocation(a2,b2);
        int largestRow2 = 0;
        int largestCol2 = 0;
        int largest2 = 0;
        for(int i=0; i<100;i++)
        {
            radar2.scan();
        }
        for(int i=0; i<radar2.getNumRows();i++)
            for(int j=0; j<radar2.getNumCols(); j++)
            {
                if (radar2.getAccumulatedDetection(i,j) > largest2)
                {
                    largest2= radar2.getAccumulatedDetection(i,j);
                    largestRow2 = i;
                    largestCol2 = j;
                }
            }
            
        assertEquals(largestRow2,a2);
        assertEquals(largestCol2,b2);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
