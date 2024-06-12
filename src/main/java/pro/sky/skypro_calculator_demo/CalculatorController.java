package pro.sky.skypro_calculator_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping (path = "/calculator")
    public String hello() {
        return "<b>Добро пожаловать в калькулятор!<b>";
    }

}
