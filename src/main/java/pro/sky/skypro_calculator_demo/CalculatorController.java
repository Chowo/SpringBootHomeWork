package pro.sky.skypro_calculator_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        int result = calculatorService.sum(number1, number2);
        return number1 + " + " + number2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        int result = calculatorService.subtraction(number1, number2);
        return number1 + " - " + number2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        int result = calculatorService.multiply(number1, number2);
        return number1 + " * " + number2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "Один или оба параметра не определены";
        }
        if (number2 == 0) {
            return "Деление на ноль запрещено";
        }
        int result = calculatorService.divide(number1, number2);
        return number1 + " / " + number2 + " = " + result;
    }

}
