package Vorlesung.Lampdas.Calculator;

public class Calculator {
    public static void main(String[] args) {
        CalculateAction add = (a, b) -> a + b;
        CalculateAction sub = (a, b) -> a - b;
        CalculateAction div = (a, b) -> a * b;
        CalculateAction mul = (a, b) -> a / b;

        System.out.println(add.mathAction(10,20));
        System.out.println(sub.mathAction(10,20));
        System.out.println(div.mathAction(10,20));
        System.out.println(mul.mathAction(10,20));
    }
}
