package unit.tests.unitTest.service;

import org.springframework.stereotype.Service;
import unit.tests.unitTest.exception.ZeroDividerException;
import unit.tests.unitTest.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public int calculatorSum(Integer num1, Integer num2) {
        return num1 + num2;
    }
    @Override
    public int calculatorMinus(Integer num1, Integer num2) {
        return num1-num2;
    }
    @Override
    public int calculatorMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    @Override
    public float calculatorDivide(Integer num1, Integer num2) {
        if(num2 == 0) {
            throw new ZeroDividerException();
        }
        return num1 / num2;
    }
}
