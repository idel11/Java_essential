package lesson1.home_task_5;

import java.util.Scanner;

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address() {
    }

    public String getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {

        Address adr = new Address();

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть індекс: ");
        adr.setIndex(sc.next());

        System.out.print("Введіть країну: ");
        adr.setCountry(sc.next());

        System.out.print("Введіть місто: ");
        adr.setCity(sc.next());

        System.out.print("Введіть вулицю: ");
        adr.setStreet(sc.next());

        System.out.print("Введіть номер дому: ");
        adr.setHouse(sc.nextInt());

        System.out.print("Введіть номер квартири: ");
        adr.setApartment(sc.nextInt());
        sc.close();

        System.out.println();
        System.out.println("Ваша адреса: ");
        System.out.print(adr.getIndex() + "," + " ");
        System.out.print(adr.getCountry() + "," + " ");
        System.out.println("місто " + adr.getCity() + "," + " ");
        System.out.print("вул. " + adr.getStreet() + "," + " ");
        System.out.print("буд. " + adr.getHouse() + "," + " ");
        System.out.print("кв. " + adr.getApartment());

    }
}
