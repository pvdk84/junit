package pvdk84.junit;

/**
 * Simple calculator, with addition, subtraction
 * multiplication, and division, of whole numbers.
 * To test in CalculatorTest
 */

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }
}
