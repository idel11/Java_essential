package lesson3.task3;

import java.util.Arrays;

public class Car extends Vehicle {

    private float greep;

    public Car(int[] coordinates, double price, int speed, int yearOfProduction, float greep) {
        super(coordinates, price, speed, yearOfProduction);
        this.greep = greep;
    }

    @Override
    public String toString() {
        return "Car{" +
                "greep=" + greep +
                ", coordinates=" + Arrays.toString(coordinates) +
                ", price=" + price +
                ", speed=" + speed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
