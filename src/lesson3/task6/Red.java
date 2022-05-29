package lesson3.task6;

public class Red extends Printer {

    void print(String value) {
        System.out.println("\u001B[31m" + value + "\u001B[0m");
    }

}
