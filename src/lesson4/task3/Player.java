package lesson4.task3;

public class Player implements Recodable, Playable {

    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void record() {
        System.out.println("Recording is started");
    }

    @Override
    public void pause(String action) {
        switch (action) {
            case "play":
                System.out.println("Playing is paused");
                break;

            case "rec":
                System.out.println("Recording is paused");
                break;
        }
    }

    @Override
    public void stop(String action) {
        switch (action) {
            case "play":
                System.out.println("Playing is stopped");
                break;

            case "rec":
                System.out.println("Recording is stopped");
                break;
        }
    }
}
