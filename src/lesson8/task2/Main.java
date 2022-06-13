package lesson8.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker[] arrWorker = new Worker[2];
       /* try {
            throw new YearFormatException();*/
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
      /*  } catch (YearFormatException e) {
            e.method();
        }*/

        System.out.println(Arrays.toString(arrWorker));
    }
}
