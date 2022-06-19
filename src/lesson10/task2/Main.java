package lesson10.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        System.out.println("============ Перевірка метода addElement та toString ============");
        list.addElement(0);
        list.addElement("test_one");
        System.out.println(list);

        System.out.println("============ Перевірка метода getByIndex ============");
        System.out.println(list.getByIndex(0));
        System.out.println(list.getByIndex(1));

        System.out.println("============ Перевірка динамічного розширення масиву ============");
        for (int i = 2; i < 10; i++) {
            list.addElement("test" + i);
            System.out.println(list);
        }

        System.out.println("============ Перевірка метода size ============");
        System.out.println(list.size());
    }
}
