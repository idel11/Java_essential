package lesson3.additional_task;

public class ElectricGuitar extends Guitar {

    private int power;

    public ElectricGuitar(int id, String type, int numberOfStrings, int power) {
        super(id, type, numberOfStrings);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void doElectricGuitarActions() {

        System.out.println("Electric Guitar action is in work");

    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "power=" + power +
                '}';
    }
}
