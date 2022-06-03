package lesson4.flight_search_app.models;

public class Ticket {

    private int id;
    private String direction;
    private double price;

    public Ticket(int id, String direction, double price) {
        this.id = id;
        this.direction = direction;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", price=" + price +
                '}';
    }
}
