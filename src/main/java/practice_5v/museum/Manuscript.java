package practice_5v.museum;

public class Manuscript extends Exhibit {
    public Manuscript(String name){
        super(name);
    }

    @Override
    public void discribe() {
        super.discribe();
        System.out.println("Древний текст");
    }

    @Override
    public void preserve() {
        super.preserve();
        System.out.println("Контроль влажности");
    }
}
