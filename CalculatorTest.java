import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testBasicAddition() {
        double result = Calculator.run("4+5");
        assertEquals(9.0, result, 0.001);
    }

    @Test
    public void testOperatorPrecedence() {
        double result = Calculator.run("10+5*4+3");
        assertEquals(33.0, result, 0.001);
    }
}

