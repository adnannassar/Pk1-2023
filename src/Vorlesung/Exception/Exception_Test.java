package Vorlesung.Exception;

public class Exception_Test {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(div(5, 2));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }

    static int div(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("ERROR: " + a + " / b(0) is not allowed!");
        }
        return a / b;
    }

}
