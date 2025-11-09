package practice_5v.aquarium;

public class Shark extends SeaCreature {
    public Shark(){
        super("Акула");
    }


    @Override
    public void behave() {
        System.out.println(name + " плавает быстро");
    }
}
