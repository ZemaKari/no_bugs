package practice_5v.pet;

public class Cat extends Pet {
    public Cat(String name){
        super("Кошка, " + name);
    }

    @Override
    void feed() {
        System.out.println(this.name + ", ест влажный корм.");
    }

    @Override
    void interact(){
        System.out.println(this.name + ", играет.");
    }
}
