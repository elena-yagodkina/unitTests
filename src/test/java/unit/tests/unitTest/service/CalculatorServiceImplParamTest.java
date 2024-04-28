package unit.tests.unitTest.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {
    private CalculatorService service = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("dataSourceSumTest")
    public void calculatorSumParamTest(int num1, int num2, int expected) {
        int result = service.calculatorSum(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceSumTest() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(5, 8, 13),
                Arguments.of(6, 12, 18)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSourceMinusTest")
    public void calculatorMinusParamTest(int num1, int num2, int expected) {
        int result = service.calculatorMinus(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceMinusTest() {
        return Stream.of(
                Arguments.of(6, 2, 4),
                Arguments.of(13, 8, 5),
                Arguments.of(18, 12, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSourceMultiplyTest")
    public void calculatorMultiplyParamTest(int num1, int num2, int expected) {
        int result = service.calculatorMultiply(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceMultiplyTest() {
        return Stream.of(
                Arguments.of(6, 2, 12),
                Arguments.of(5, 8, 40),
                Arguments.of(2, 12, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("dataSourceDivideTest")
    public void calculatorDivideParamTest(int num1, int num2, int expected) {
        float result = service.calculatorDivide(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceDivideTest() {
        return Stream.of(
                Arguments.of(12, 2, 6),
                Arguments.of(40, 8, 5),
                Arguments.of(24, 12, 2)
        );
    }
}
