package practice_5v.pet;

public abstract class Pet {
    public String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract void feed();

    abstract  void interact();

}

