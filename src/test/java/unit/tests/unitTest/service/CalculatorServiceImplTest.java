package unit.tests.unitTest.service;

import org.junit.jupiter.api.Test;
import unit.tests.unitTest.exception.ZeroDividerException;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private CalculatorService service = new CalculatorServiceImpl();

    @Test
    public void calculatorSumTest() {
        int result = service.calculatorSum(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void calculatorMinusTest() {
        int result = service.calculatorMinus(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void calculatorMultiplyTest() {
        int result = service.calculatorMultiply(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void calculatorDivideTest() {
        float result = service.calculatorDivide(6, 2);
        assertEquals(3, result);
    }

    @Test
    public void throwExceptionWhenDivideByZero() {
        assertThrows(ZeroDividerException.class, () -> service.calculatorDivide(5, 0));
    }
}
