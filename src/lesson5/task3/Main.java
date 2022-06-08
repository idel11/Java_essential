package lesson5.task3;

import lesson5.task2.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo.main();

        Zoo.listOfAnimals.remove(2);
        Zoo.listOfAnimals.remove(3);
        Zoo.listOfAnimals.remove(4);

        System.out.println();
        System.out.println("Size of your zoo now is " + Zoo.listOfAnimals.size());
        System.out.println("Now your zoo consists of " + Zoo.listOfAnimals);
    }
}
