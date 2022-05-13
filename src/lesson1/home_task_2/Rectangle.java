package lesson1.home_task_2;

import java.util.Scanner;

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    static double areaCalculator(Rectangle rec) {
        return rec.side1 * rec.side2;
    }

    static double perimeterCalculator(Rectangle rec) {
        return 2 * (rec.side1 + rec.side2);
    }

    public static void main(String[] args) {

        System.out.print("Введіть сторони прямокутника через пробіл: ");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] s = temp.split(" ");
        sc.close();

        double side1 = Double.parseDouble(s[0]);
        double side2 = Double.parseDouble(s[1]);

        Rectangle rec = new Rectangle(side1, side2);

        System.out.println("Площа = " + areaCalculator(rec));
        System.out.println("Периметр = " + perimeterCalculator(rec));

    }
}


