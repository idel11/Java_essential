package lesson3.task6;

public class Green extends Printer {

    void print(String value) {
        System.out.println("\u001B[32m" + value + "\u001B[0m");
    }
}
