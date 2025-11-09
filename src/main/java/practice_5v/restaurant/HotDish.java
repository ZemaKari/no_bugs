package practice_5v.restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(String name, int temperature){
        super(name);
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }

    @Override
    void getDiscription() {
        System.out.println("Блюдо: " + this.getName() + ". Температура подачи: " + this.getTemperature() + "C. ");
    }
}
