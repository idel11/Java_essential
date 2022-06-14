package lesson8.task2;

public class Worker {

    private String pIB;
    private String role;
    private int startYear;

    public Worker(String pIB, String role, int startYear) {
        this.pIB = pIB;
        this.role = role;
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "pIB='" + pIB + '\'' +
                ", role='" + role + '\'' +
                ", startYear=" + startYear +
                '}';
    }

    public int getStartYear() {
        return startYear;
    }

    public String getpIB() {
        return pIB;
    }
}
