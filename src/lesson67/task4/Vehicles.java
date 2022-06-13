package lesson67.task4;

public enum Vehicles {

    BMW(63, "'carbon black'"),
    MAZDA(27, "'soul red'"),
    FORD(17, "'race red'");

    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String toString(Vehicles car) {
        String temp = "Vehicle name is " + name() + ", it costs $" + price + "000 and color is " + color;
        return temp;
    }
}
