package pvdk84.junit;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Tests for Calculator
 * Super TestCase for setUp() and tearDown()
 */

public class CalculatorTest extends TestCase {

    Calculator calculator;

    @Before // runs before each test
    protected void setUp() {
        calculator = new Calculator();
    }

    @After // runs after each test
    protected void tearDown() {
        calculator = null;
    }

    @Test
    public void testOnePlusFiveEqualsSix() {
        int result = calculator.add(1,5);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void testTenMinusSixEqualsFour() {
        int result = calculator.subtract(10,6);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void testFiveTimesFourEqualsTwenty() {
        int result = calculator.multiply(5,4);
        int expected = 20;
        assertEquals(expected, result);
    }

    @Test
    public void testHundredDividedByTenEqualsTen() {
        double result = calculator.divide(100,10);
        double expected = 11;
        assertEquals(expected, result);
    }
}