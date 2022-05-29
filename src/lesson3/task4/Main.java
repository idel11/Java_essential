package lesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Якщо у Вас є ключ Pro - то введіть Pro, " +
                "Якщо у Вас є ключ Exp - то введіть Exp," +
                "Якщо у Вас немає ключа - то нажміть Enter");

        System.out.print("Введіть ключ: ");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.println();

        switch (key) {
            case "Pro":
                DocumentWorker proKey = new ProDocumentWorker();
                proKey.openDocument();
                proKey.editDocument();
                proKey.saveDocument();
                break;

            case "Exp":
                DocumentWorker expKey = new ExpertDocumentWorker();
                expKey.openDocument();
                expKey.editDocument();
                expKey.saveDocument();
                break;

            default:
                DocumentWorker noKey = new DocumentWorker();
                noKey.openDocument();
                noKey.editDocument();
                noKey.saveDocument();
        }

    }

}
