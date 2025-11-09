package practice_5v.pet;

public class Dog extends Pet{
    public Dog(String name){
        super("Собака, " + name);
    }

    @Override
    void feed() {
        System.out.println(this.getName() + ", ест сухой корм.");
    }

    @Override
    void interact() {
        System.out.println(this.getName() + ",  гуляет.");
    }
}
