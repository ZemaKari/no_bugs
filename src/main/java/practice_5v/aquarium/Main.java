package practice_5v.aquarium;

public class Main {
    public static void main(String[] args) {
        Shark shark  = new Shark();
        StarFish starFish = new StarFish();
        Aquarium aquarium = new Aquarium();
        aquarium.showBehevior();
        aquarium.add(shark);
        aquarium.showBehevior();
        aquarium.add(starFish);
        aquarium.showBehevior();
    }
}
