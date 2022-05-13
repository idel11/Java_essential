package lesson1.home_task_4;

import java.util.Scanner;

public class Computer {
    private String model;
    private double price;

    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Computer[] arrComp = new Computer[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Введіть модель комп'ютера та ціну через пробіл: ");
            String temp = sc.nextLine();
            String[] s = temp.split(" ");

            String model = s[0];
            double price = Double.parseDouble(s[1]);

            Computer comp = new Computer(model, price);

            arrComp[i] = comp;

        }

        sc.close();


        System.out.println();
        System.out.println("Ви добавили 5 комп'ютерів: ");
        for (int i = 0; i < arrComp.length; i++) {
            System.out.println((i + 1) + ") модель: " + arrComp[i].model + ", ціна: " + arrComp[i].price);
        }
    }
}
