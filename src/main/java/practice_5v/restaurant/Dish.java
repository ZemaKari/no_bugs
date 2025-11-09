package practice_5v.restaurant;

public abstract class Dish {
    private String name;
    public Dish(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
    abstract  void  getDiscription();

    @Override
    public String toString() {
        return String.format(" %s ", this.getName());
    }
}

