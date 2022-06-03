package lesson4.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Виберіть один з форматів документу: DOC, TXT, XML");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть формат документу: ");
        String format = sc.nextLine();
        sc.close();

        switch (format) {
            case "DOC":
                AbstractHandler doc = new DOCHandler();
                doc.create();
                doc.open();
                doc.change();
                doc.save();
                break;

            case "TXT":
                AbstractHandler txt = new TXTHandler();
                txt.create();
                txt.open();
                txt.change();
                txt.save();
                break;

            case "XML":
                AbstractHandler xml = new XMLHandler();
                xml.create();
                xml.open();
                xml.change();
                xml.save();
                break;
        }

    }

}
