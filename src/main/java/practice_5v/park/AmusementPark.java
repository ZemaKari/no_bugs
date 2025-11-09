package practice_5v.park;

public class AmusementPark {
    public Attraction attraction;

    public void add(Attraction attraction){
        this.attraction = attraction;
    }

    public void show(){
        if (attraction != null){
            attraction.info();
            attraction.maintain();
        } else {
            System.out.println("В парке нет атракциона.");
        }
    }
}
