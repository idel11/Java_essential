package lesson8.task5;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) throws Exception {
        if (b == 0) {
            return a / b;
        } else return (double) a / b;
    }
}
