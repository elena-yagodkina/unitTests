package unit.tests.unitTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping(path = "/plus")
    public String calculatorSum(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null) {
            return "Необходимо заполнить все параметры";
        }
        else {
            return String.format("%s + %s = %s", num1, num2, calculatorService.calculatorSum(num1, num2));}
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null) {
            return "Необходимо заполнить все параметры";
        }
        else {
            return String.format("%s - %s = %s", num1, num2, calculatorService.calculatorMinus(num1, num2));}
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null) {
            return "Необходимо заполнить все параметры";
        }
        else {
            return String.format("%s * %s = %s", num1, num2, calculatorService.calculatorMultiply(num1, num2));}
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null || num2 == null) {
            return "Необходимо заполнить все параметры";
        }
        else {
            return String.format("%s / %s = %s", num1, num2, calculatorService.calculatorDivide(num1, num2));
        }
    }
}

