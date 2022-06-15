package lesson9.task5;

public class Main {
    public static void main(String[] args) {

        Animal markiz = new Animal("Маркіз", 8, true);
        Animal chunga = new Animal("Чунга-Чанга", 5, false);

        System.out.println(markiz);
        System.out.println(chunga);

        Animal vaska = new Animal("Васька", 45, false);
        Animal vaska2 = new Animal("Васька", 45, false);
        System.out.println(vaska);

        String temp;
        if (vaska.equals(vaska2)) {
            temp = "Так";
        } else temp = "Ні";

        System.out.println("Васьки однакові? - " + temp);

    }
}
