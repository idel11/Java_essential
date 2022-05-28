package lesson3.task2;

public class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.println("study mark is 2");
    }

    @Override
    void read() {
        System.out.println("read mark is 2");
    }

    @Override
    void write() {
        System.out.println("write mark is 2");
    }

    @Override
    void relax() {
        System.out.println("relax mark is 2");
    }

}
