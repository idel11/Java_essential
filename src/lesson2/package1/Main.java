package lesson2.package1;

class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car(2021, "carbon");

        System.out.println(bmw.color);
        System.out.println(audi);
    }
}
