import io.qameta.allure.Step;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Step("I subtract {1} from {0}")
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        String str = "2020-04-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(str, formatter);
        System.out.println();
    }
}