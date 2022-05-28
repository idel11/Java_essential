package additional_task;

public class Main {
    public static void main(String[] args) {
        Animal all = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal mouse = new Mouse();

        Animal[] arr = {cat, dog, mouse};

        for (Animal animal : arr) {
            all.voice();
            animal.voice();
        }

        all.voice("say");

    }
}
