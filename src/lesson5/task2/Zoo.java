package lesson5.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static ArrayList<String> listOfAnimals = new ArrayList<>();

    static void add(int index, String element) {
        listOfAnimals.add(index, element);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Add the name of the animal #" + (i + 1) + ": ");
            add(i, sc.nextLine());
        }
        sc.close();

        System.out.println();
        System.out.print("Your zoo consists of ");
        System.out.println(listOfAnimals);

    }
}
