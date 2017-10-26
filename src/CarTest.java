import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Tests for Car
 */
public class CarTest {
    private static final double TOL = 1.0e-12;
    private Car testCar;
    private static final double TANK_CAPACITY = 50.0;
    private double fuel;
    private String condition;
    private int totalDistanceTravelled;


    // YOU DO NOT NEED TO TEST GETTER AND SETTER METHODS DIRECTLY

    @Before
    public void setUp() {
        testCar = new Car();
    }

    @Test
    public void testConstructor() {
        assertEquals(TANK_CAPACITY, testCar.getFuel(), TOL);
        assertEquals("working", testCar.getCondition());
        assertEquals(0, testCar.getTotalDistanceTravelled());

    }

    @Test
    public void testBroken() {
        if (totalDistanceTravelled> 1000.0)
        { public String replace(char cond, char broken);
            String=("Condition"){this.condition=broken;}


        }
        //TODO: put your tests here
    }

    @Test
    public void testGetDistanceUntilEmpty() {
        //TODO: put your test here
    }

    @Test
    public void testDrive() {
        //TODO: put your test here
    }

    @Test
    public void testAddGasToTank() {
        //TODO: put your test here
    }

    @Test
    public void testRepair() {
        //TODO: put your test here
    }

    //TODO: CREATE TESTS FOR YOUR OWN METHODS
}