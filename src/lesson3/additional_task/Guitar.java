package lesson3.additional_task;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(int id, String type, int numberOfStrings) {
        super(id, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(short numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void doGuitarActions() {

        System.out.println("Guitar action is in work");

    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }
}
