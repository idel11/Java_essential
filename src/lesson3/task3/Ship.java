package lesson3.task3;

import java.util.Arrays;

public class Ship extends Vehicle {

    private String port;
    private int numberOfPassengers;

    public Ship(int[] coordinates, double price, int speed, int yearOfProduction, String port, int numberOfPassengers) {
        super(coordinates, price, speed, yearOfProduction);
        this.port = port;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "port='" + port + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", coordinates=" + Arrays.toString(coordinates) +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}


