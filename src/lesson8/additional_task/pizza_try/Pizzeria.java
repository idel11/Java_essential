package lesson8.additional_task.pizza_try;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

    public static List<Pizza> addPizzas() throws PizzaInputException {

        List<Pizza> listOfPizzas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.print("enter pizza name: ");
            String name = sc.next();
            System.out.print("enter pizza price: ");
            //try {
                int price = sc.nextInt();
            /*} catch (Exception x){
                System.out.println(x.getMessage());
            }*/
            System.out.print("enter pizza size: ");
            int size = sc.nextInt();
            if ((size > PizzaSizeEnum.LARGE.getSize()) || (size < PizzaSizeEnum.SMALL.getSize())) {
                throw new PizzaInputException("Wrong pizza size");
            }

            try {
                listOfPizzas.add(new Pizza(name, price, PizzaSizeEnum.getPizzaSizeNameBySize(size)));
            } catch (PizzaNotFoundException p) {
                System.out.println(p.getMessage());
            }

        }
        return listOfPizzas;

    }

}
