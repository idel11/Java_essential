package lesson2.package2;

class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car porsche = new Car(1968);
        Car mercedes = new Car(2020, 250);
        Car ferrari = new Car(2022, 300, 1500);
        Car bmw = new Car(2021, 250, 2000, "carbon");

        System.out.println(audi);
        System.out.println(porsche);
        System.out.println(mercedes);
        System.out.println(ferrari);
        System.out.println(bmw);

    }
}
