package pro.sky.skypro_calculator_demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String hello() {
        return "<b>Добро пожаловать в калькулятор!<b>";
    }


    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return number1 / number2;
    }

}
