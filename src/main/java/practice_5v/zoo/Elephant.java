package practice_5v.zoo;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    void add() {
        System.out.println("Слон принят в зоопарк");
    }


    @Override
    void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    void move() {
        System.out.println("Слон ходит");
    }
}
