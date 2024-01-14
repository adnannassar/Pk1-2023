package Vorlesung.Lampdas.BasicExample;

public class Main {

    public static void main(String[] args) {
        Greeting germanGreet = () -> System.out.println("HALLO WELT!");
        germanGreet.greet();

        Greeting englishGreet = () -> System.out.println("HELLO WORLD!");
        englishGreet.greet();

    }
}




