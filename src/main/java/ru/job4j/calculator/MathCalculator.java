package ru.job4j.calculator;

//import ru.job4j.calculator.MathFunction;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAll(double first, double second) {
        return sum(first, second) + sub(first, second) + div(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAll(10,  20));
    }
}
