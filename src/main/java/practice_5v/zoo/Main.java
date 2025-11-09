package practice_5v.zoo;

public class Main {
    public static void main(String[] args) {
        Animal el = new Elephant("Топа");
        Animal br = new Bird("Невеличка");
        Zoo zoo = new Zoo();
        zoo.add(el);
        zoo.add(br);
        zoo.showAnimalBehavior(el);
        zoo.showAnimalBehavior(br);
    }
}
