package lesson9.task5;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private boolean haveTail;

    public Animal(String name, int age, boolean haveTail) {
        this.name = name;
        this.age = age;
        this.haveTail = haveTail;
    }

    @Override
    public String toString() {

        String tail;
        if (haveTail) {
            tail = "так";
        } else tail = "ні";

        return
                "Ім'я: '" + name + '\'' +
                        ", вік: " + age +
                        ", хвіст: " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && haveTail == animal.haveTail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, haveTail);
    }
}
