package lesson3.task3;

import java.util.Arrays;

public class Plane extends Vehicle {
    public double altitude;
    private int numberOfPassengers;

    public Plane(int[] coordinates, double price, int speed, int yearOfProduction, double altitude, int numberOfPassengers) {
        super(coordinates, price, speed, yearOfProduction);
        this.altitude = altitude;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "altitude=" + altitude +
                ", numberOfPassengers=" + numberOfPassengers +
                ", coordinates=" + Arrays.toString(coordinates) +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}


