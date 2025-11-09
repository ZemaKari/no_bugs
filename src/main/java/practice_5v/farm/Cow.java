package practice_5v.farm;

public class Cow extends FarmAnimal{
    private final static int COUNT_LAG = 4;
    private  final  int lag;

    public Cow(String name){
        super(name);
        this.lag = COUNT_LAG;
    }

    public int getLag() {
        return lag;
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println(" ест траву.");
    }

    @Override
    public void care() {
        super.care();
        System.out.println(" нужен выпас.");
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println(" дает молоко.");
    }
}
