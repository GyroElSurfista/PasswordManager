package GenCont;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class ConjCaracteresTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConjCaracteresTest
{
    /**
     * Default constructor for test class ConjCaracteresTest
     */
    public ConjCaracteresTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    
    @Test
    public void testGetRandCar(){
        ConjCaracteres conj;
        
        conj = construccion();
        
        System.out.println(conj.getRandChar());
        
    }
    
    private ConjCaracteres construccion(){
        ConjCaracteres conj;
        Integer[] subconj1 = new Integer[2];
        Integer[] subconj2 = new Integer[2];
        Integer[] subconj3 = new Integer[2];
        Integer[] subconj4 = new Integer[2];
        ArrayList<Integer[]> conjs = new ArrayList<>();
        
        subconj1[0] = 33;
        subconj1[1] = 47;
        
        subconj2[0] = 58;
        subconj2[1] = 64;
        
        subconj3[0] = 94;
        subconj3[1] = 96;
        
        subconj4[0] = 126;
        subconj4[1] = 126;
        
        conjs.add(subconj1);
        conjs.add(subconj2);
        conjs.add(subconj3);
        conjs.add(subconj4);
        
        conj = new ConjCaracteres(conjs);
        
        
        return conj;
    }
}
