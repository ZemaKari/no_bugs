package practice_5.park;

public abstract class Attraction implements Info, Maintain{
    private String name;


    public Attraction(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public abstract void  info();

    @Override
    public abstract void maintain();

}
