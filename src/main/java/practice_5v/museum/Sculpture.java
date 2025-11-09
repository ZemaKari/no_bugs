package practice_5v.museum;

public class Sculpture extends Exhibit {
    public Sculpture(String name){
        super(name);
    }

    @Override
    public void discribe() {
        super.discribe();
        System.out.println("Реставрация");
    }

    @Override
    public void preserve() {
        super.preserve();
        System.out.println("Скульптурный объект.");
    }
}
