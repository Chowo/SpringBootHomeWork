package pro.sky.skypro_calculator_demo;

import jakarta.annotation.Nonnull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(path = "/calculator")

    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping(path = "/calculator/plus")
    public int sum(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.sum(number1, number2);
    }

    @RequestMapping(path = "/calculator/minus")
    public int subtraction(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.subtraction(number1, number2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public int multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.multiply(number1, number2);
    }

    @RequestMapping(path = "/calculator/divide")
    public int divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divide(number1, number2);
    }

}
