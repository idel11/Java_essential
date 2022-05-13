package lesson1.home_task_3;

import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private String content;

    public Book(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть автора: ");
        String authTemp = sc.nextLine();
        System.out.print("Введіть назву книги: ");
        String titleTemp = sc.nextLine();
        System.out.print("Введіть зміст: ");
        String contentTemp = sc.nextLine();
        sc.close();

        Book book = new Book(authTemp, titleTemp, contentTemp);

        System.out.println();
        Author a = new Author(book.author);
        System.out.print("Автор книги: ");
        a.show();

        Title t = new Title(book.title);
        System.out.print("Назва книги: ");
        t.show();

        Content c = new Content(book.content);
        System.out.print("Зміст книги: ");
        c.show();

    }

}
