package practice_5v.farm;

public class Main {
    public static void main(String[] args) {
        FarmAnimal chicken = new Chicken("Klusha");
        FarmAnimal cow = new Cow("Manya");
        Cow cow1 = new Cow("Chernuchka");
        Chicken chicken1 = new Chicken("Ryaba");
        Farm farm = new Farm();
        farm.serviceAnimal(chicken1);
        farm.serviceAnimal(cow1);
        farm.serviceAnimal(cow);
    }
}
