package lesson10.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("'text' ");
        MyClass.factoryMethod("text");
        System.out.print("'0.0D ' ");
        MyClass.factoryMethod(0.0D);
        System.out.print("'0' ");
        MyClass.factoryMethod(0);
        System.out.print("'F' ");
        MyClass.factoryMethod('F');

    }
}
