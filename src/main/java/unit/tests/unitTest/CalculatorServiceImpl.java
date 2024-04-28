package unit.tests.unitTest;

public class CalculatorServiceImpl implements CalculatorService{
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    public long calculatorSum(Integer num1, Integer num2) {
        return num1 - num2;
    }
    public long calculatorMinus(Integer num1, Integer num2) {
        return num1-num2;
    }
    public int calculatorMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    public float calculatorDivide(Integer num1, Integer num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
