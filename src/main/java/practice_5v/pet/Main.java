package practice_5v.pet;

public class Main {
    public static void main(String[] args) {
        Pet dog1 = new Dog("Сенат");
        Pet dog2 = new Dog("Бакстер");
        Pet cat = new Cat("Парламент");
        PetManager manager = new PetManager();
        manager.handlePet(dog1);
        manager.handlePet(dog2);
        manager.handlePet(cat);
    }
}
