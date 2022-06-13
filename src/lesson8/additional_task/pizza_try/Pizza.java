package lesson8.additional_task.pizza_try;

public class Pizza {

    private String name;
    private int price;
    private PizzaSizeEnum size;

    public Pizza(String name, int price, PizzaSizeEnum size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PizzaSizeEnum getSize() {
        return size;
    }

    public void setSize(PizzaSizeEnum size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }


}
