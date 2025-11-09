package practice_5v.restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(String name, int volume){
        super(name);
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }

    @Override
    void getDiscription() {
        System.out.println("Напиток: " + this.getName() + ". Объем " + this.getVolume() + "мл.");
    }
}
