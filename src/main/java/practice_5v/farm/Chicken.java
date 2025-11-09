package practice_5v.farm;

public class Chicken extends FarmAnimal{
    private final static int COUNT_FOOT = 2;
    private final int chicken_foot;

    public Chicken(String name){
        super(name);
        this.chicken_foot=COUNT_FOOT;
    }

    public int getChicken_foot(){
        return chicken_foot;
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println(" ест зерно");
    }

    @Override
    public void care() {
        super.care();
        System.out.println(" нуждается в кормушке");
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println(" несет яйца");
    }
}
