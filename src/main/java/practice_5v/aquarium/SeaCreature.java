package practice_5v.aquarium;

public abstract class SeaCreature implements Behavior{
    protected String name;

    public SeaCreature(String name){
        this.name = name;
    }

    @Override
    public abstract void behave();
}
