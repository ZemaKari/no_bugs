package practice_5v.zoo;

public class Zoo {
    public void showAnimalBehavior(Animal animal) {
        animal.move();
        animal.makeSound();
    }

    public void add(Animal animal) {
        animal.add();
    }

}
