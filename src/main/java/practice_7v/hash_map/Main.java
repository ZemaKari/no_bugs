package practice_7v.hash_map;

public class Main {
    public static void main(String[] args) {
        //задача1
//        Task1 hashMap1 = new Task1();
//        hashMap1.addRecord("Вася",25 );
//        hashMap1.addRecord("Оля",15 );
//        hashMap1.addRecord("Олег", 16);
//        hashMap1.addRecord("Игорь", 24 );
//        hashMap1.addRecord("Ваня", 11);
//        hashMap1.printMap();
        //задача2
        Task2 hashMap2 = new Task2();
        hashMap2.add("Вася",25 );
        hashMap2.add("Оля",15 );
        hashMap2.add("Олег", 16);
        hashMap2.add("Игорь", 24 );
        hashMap2.add("Ваня", 11);
        hashMap2.chackName("вася");
        hashMap2.printBook();
    }
}
