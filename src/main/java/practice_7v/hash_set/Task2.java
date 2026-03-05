package practice_7v.hash_set;

import java.util.HashSet;

public class Task2 {
    private HashSet<Integer> hashSet2;

    public Task2() {
        this.hashSet2 = new HashSet<>();
    }

    //метод добавляет число в коллекцию
    public void addNumber(Integer num) {
        hashSet2.add(num);
    }

    //метод проверки  заданного числа
    public void checkNumber(Integer num) {
        if (hashSet2.contains(num)) {
            System.out.println("Данное число есть в коллекции");
        } else System.out.println("Такого числа нет");
    }
}
