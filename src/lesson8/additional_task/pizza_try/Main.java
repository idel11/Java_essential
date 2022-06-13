package lesson8.additional_task.pizza_try;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(Pizzeria.addPizzas());
        } catch (PizzaInputException e) {
            System.out.println(e.getMessage());
        }

    }
}
