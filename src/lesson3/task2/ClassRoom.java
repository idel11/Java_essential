package lesson3.task2;

public class ClassRoom {

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {

        Pupil[] arr = {pupil1, pupil2, pupil3, pupil4};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {

        Pupil[] arr = {pupil1, pupil2, pupil3};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {

        Pupil[] arr = {pupil1, pupil2};
    }

    public ClassRoom(Pupil pupil1) {

        Pupil[] arr = {pupil1};
    }

    @Override
    public String toString() {
        return "ClassRoom{}";
    }
}
