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
    public String sum(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        return number1 + " + " + number2 + " = " + calculatorService.sum(number1, number2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        return number1 + " - " + number2 + " = " + calculatorService.subtraction(number1, number2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        return number1 + " * " + number2 + " = " + calculatorService.multiply(number1, number2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        if (number2 == 0) {
            return "Деление на ноль запрещено";
        }
        return number1 + " / " + number2 + " = " + calculatorService.divide(number1, number2);
    }

}
