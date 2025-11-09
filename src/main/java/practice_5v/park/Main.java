package practice_5v.park;


public class Main {
    public static void main(String[] args) {
        Carusel carousel= new Carusel();
        RollerCoaster rollerCoaster = new RollerCoaster();
        AmusementPark amusementPark = new AmusementPark();
        amusementPark.show();
        amusementPark.add(carousel);
        amusementPark.show();
        amusementPark.add(rollerCoaster);
        amusementPark.show();

    }
}
