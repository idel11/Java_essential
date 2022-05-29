package lesson3.task6;

public class Main {
    public static void main(String[] args) {

        Printer inDef = new Printer();
        Printer inRed = new Red();
        Printer inGreen = new Green();
        Printer inBlue = new Blue();

        System.out.println();
        inDef.print("some text in default color");
        inRed.print("some text in red color");
        inGreen.print("some text in green color");
        inBlue.print("some text in blue color");

    }
}
