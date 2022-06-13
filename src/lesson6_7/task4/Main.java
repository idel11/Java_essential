package lesson6_7.task4;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Vehicles bmw = Vehicles.BMW;
        Vehicles mazda = Vehicles.MAZDA;
        Vehicles ford = Vehicles.FORD;

        System.out.println(bmw.toString(bmw));
        System.out.println(mazda.toString(mazda));
        System.out.println(ford.toString(ford));
    }
}
