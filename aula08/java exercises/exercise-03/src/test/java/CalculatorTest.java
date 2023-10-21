import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @DisplayName("Sum test")
    @Test
    public void testAddition() {
        assertEquals(10.0, calculator.addition(4.0, 6.0), 0.001);
    }

    @DisplayName("Subtraction test")
    @Test
    public void testSubtraction() {
        assertEquals(5.0, calculator.subtraction(10.0, 5.0), 0.001);
    }

    @DisplayName("Multiplication test")
    @Test
    public void testMultiplication() {
        assertEquals(15.0, calculator.multiplication(3.0, 5.0), 0.001);
    }

    @DisplayName("Division test")
    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.division(10.0, 5.0), 0.001);
    }

    @DisplayName("Division by zero test")
    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(10.0, 0.0);
        });
    }

    @DisplayName("SquareRoot test")
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0), 0.001);
    }

    @DisplayName("Power test")
    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
    }
}
