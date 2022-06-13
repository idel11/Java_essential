package lesson8.task5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fist number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("adding = " + Calculator.add(a, b));
        System.out.println("subtraction = " + Calculator.sub(a, b));
        System.out.println("multiply = " + Calculator.mul(a, b));

        try {
            System.out.println("Dividing = " + Calculator.div(a, b));
        } catch (Exception e) {
            System.out.println("\u001B[31m Dividing on 0 is forbidden \u001B[0m");
        }

    }
}
