package lesson3.task3;

public class Main {
    public static void main(String[] args) {

        int[] carCoord = {23, 34};
        int[] shipCoord = {11, 12};
        int[] planeCoord = {35, 47};

        Car bmw = new Car(carCoord, 120.5, 250, 2021, 3.0f);

        Ship santamaria = new Ship(shipCoord, 320000, 80,
                2022, "Odesa", 700);

        Plane mria = new Plane(planeCoord, 25000, 900,
                2023, 30000, 500);

        System.out.println();
        System.out.println(bmw);
        System.out.println(mria);
        System.out.println(santamaria);

    }
}
