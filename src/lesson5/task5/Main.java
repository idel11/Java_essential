package lesson5.task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listOfTeachers = new ArrayList<>();

        System.out.println();
        listOfTeachers.add(0, "Наталя Вікторівна");
        listOfTeachers.add(1, "Алла Миколаївана");
        listOfTeachers.add(2, "Людмила Петрівна");

        System.out.println("Список вчителів: " + listOfTeachers);
        System.out.println("Найкращий вчитель - " + listOfTeachers.get(1));
        System.out.println("Найгірший вчитель - " + listOfTeachers.get(2));

    }
}
