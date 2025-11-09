package practice_5v.aquarium;

public class Aquarium {
    private Behavior creature;

    public void add(Behavior creature){
        this.creature = creature;

    }

    public  void showBehevior(){
        if(creature != null){
            creature.behave();
        }else {
            System.out.println("Аквариум пустой.");
        }

    }
}
