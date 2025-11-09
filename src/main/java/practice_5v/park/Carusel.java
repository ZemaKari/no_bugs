package practice_5v.park;



public class Carusel extends Attraction {
    public Carusel(){
        super("Карусель");
    }

    @Override
    public void info() {
        super.info();
        System.out.println(this.getName() + " спокойный атракцион.");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println(this.getName()+ " требует тех.обслуживания.");
    }
}
