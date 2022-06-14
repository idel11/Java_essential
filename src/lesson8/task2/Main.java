package lesson8.task2;

import lesson8.task3.Price;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static final int yearToday = 2022;
    public static void main(String[] args) {
        Worker[] arrWorker = new Worker[2];
        try {
            for (int i = 0; i < arrWorker.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter PIB: ");
                String pib = sc.nextLine();
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter role: ");
                String role = sc2.nextLine();
                System.out.print("Enter start year: ");
                int year = sc.nextInt();
                arrWorker[i] = new Worker(pib, role, year);
                }
             }catch (Exception e){
            System.out.println("\u001B[31m Year format is wrong \u001B[0m");
        }

        Arrays.sort(arrWorker, Comparator.comparing(Worker::getpIB));

        System.out.println("Sorted list of workers by name: " + Arrays.toString(arrWorker));
        System.out.println("--------------------------------------------------");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter work experience in years: ");
        int exp = sc2.nextInt();
        int k = arrWorker.length;
        for (int i = 0; i < arrWorker.length; i++) {
            if(exp <= (yearToday - arrWorker[i].getStartYear())){
                System.out.println(arrWorker[i]);
                k -= 1;
            }
        }
        if (k == arrWorker.length) {
            System.out.println("No such workers");
        }

    }
}
