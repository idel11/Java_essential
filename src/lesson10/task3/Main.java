package lesson10.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        MyDictionary temp = new MyDictionary();

        for (int i = 0; i < 3; i++) {
            temp.addPair();
            System.out.println("You've added " + temp.get(i) + " by index " + i);
        }

        System.out.println("Dictionary size is " + temp.size());
        System.out.print("Final dictionary is ");
        temp.printAllElements();

    }
}
