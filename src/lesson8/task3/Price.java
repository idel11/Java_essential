package lesson8.task3;

public class Price {

    private final String name;
    private final String shop;
    private final double price;

    public Price(String name, String shop, double price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
}
