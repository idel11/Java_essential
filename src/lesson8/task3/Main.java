package lesson8.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchShopException {

        Price[] goods = new Price[2];

        System.out.println();

        for (int i = 0; i < goods.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter goods name: ");
            String name = sc.nextLine();
            System.out.print("Enter shop: ");
            String shop = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            goods[i] = new Price(name, shop, price);
        }

        Arrays.sort(goods, Comparator.comparing(Price::getShop));

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Sorted array is: " + Arrays.toString(goods));
        System.out.println("---------------------------------------------------------------");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shop name for search goods: ");
        String search = scanner.nextLine();
        System.out.println();
        int k = goods.length;
        for (Price p : goods) {
            if (search.equals(p.getShop())) {
                System.out.println("In " + p.getShop()
                        + " store you can buy " + p.getName()
                        + " for price $" + p.getPrice());
            } else k -= 1;
        }
        try {
            if (k == 0) {
                throw new NoSuchShopException();
            }
        } catch (NoSuchShopException e) {
            e.method();
        }

    }
}
