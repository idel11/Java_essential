package lesson3.task3;

import java.util.Arrays;

public class Vehicle {

    public int[] coordinates;
    public double price;
    public int speed;
    public int yearOfProduction;

    public Vehicle(int[] coordinates, double price, int speed, int yearOfProduction) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "coordinates=" + Arrays.toString(coordinates) +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
