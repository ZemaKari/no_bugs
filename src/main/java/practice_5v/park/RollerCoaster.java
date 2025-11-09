package practice_5v.park;

public class RollerCoaster extends Attraction{
    public RollerCoaster(){
        super("Горки");

    }

    @Override
    public void info() {
        super.info();
        System.out.println(this.getName()+ " острые ощущения.");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println(this.getName()+ " Проверка безопасности.");
    }
}
