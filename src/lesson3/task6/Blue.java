package lesson3.task6;

public class Blue extends Printer {

    void print(String value) {
        System.out.println("\u001B[34m" + value + "\u001B[0m");
    }

}
