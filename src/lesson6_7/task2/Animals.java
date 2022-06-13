package lesson6_7.task2;

public enum Animals {

    ELEPHANT(5),
    WOOLF(10),
    FOX(15);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    public String toString(Animals animal) {

        String temp = ("name of the animal is: " + animal + " " + "and it's age is: " + age);

        return temp;
    }

}
