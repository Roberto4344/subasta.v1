

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private Auction auction1;
    private Person person1;
    private Person person2;

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        auction1 = new Auction();
        person1 = new Person("Pedro");
        person2 = new Person("juan");
        auction1.enterLot("jarron");
        auction1.enterLot("cuadro");
        auction1.enterLot("coche");
        auction1.enterLot("cromo");
        auction1.enterLot("joya");
        auction1.showLots();
        
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
}
