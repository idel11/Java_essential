package lesson4.task2;

public class DOCHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Open ODC document");
    }

    @Override
    void create() {
        System.out.println("Create ODC document");
    }

    @Override
    void change() {
        System.out.println("Change ODC document");
    }

    @Override
    void save() {
        System.out.println("Save ODC document");
    }
}
