package lesson3.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pupil Dima = new ExcelentPupil();
        Dima.setName("Dima");
        Pupil Sasha = new GoodPupil();
        Sasha.setName("Sasha");
        Pupil Vova = new ExcelentPupil();
        Vova.setName("Vova");
        Pupil Tolya = new BadPupil();
        Tolya.setName("Tolya");


        ClassRoom a11 = new ClassRoom(Dima, Sasha, Vova, Tolya);
        System.out.print("Наш клас: " + Dima.getName() + " " + Sasha.getName() + " " + Vova.getName() + " " + Tolya.getName());

        System.out.println();
        System.out.println("======================================");

        System.out.print("Dima's ");
        Dima.study();
        System.out.print("Vova's ");
        Vova.write();
        System.out.print("Tolya's ");
        Tolya.relax();

    }

}
