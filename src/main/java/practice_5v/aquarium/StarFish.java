package practice_5v.aquarium;

public class StarFish extends SeaCreature{
    public StarFish(){
        super("Морская звезда");
    }


    @Override
    public void behave() {
        System.out.println(name +  " медленно ползает");
    }
}
