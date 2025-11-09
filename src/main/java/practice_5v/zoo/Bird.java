package practice_5v.zoo;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    void add() {
        System.out.println("Птица принята в зоопарк");
    }

    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }
}
