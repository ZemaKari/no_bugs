package practice_7v.hash_set;

import java.util.HashSet;

public class Task1 {
    private HashSet<Integer> hashSet1;

    public Task1(){
        this.hashSet1 = new HashSet<>();
    }
    //метод добавляет число в коллекцию

    public void addNumber(Integer number){
        hashSet1.add(number);

    }

    //метод для вывода коллекции

    public void printSet(){
        hashSet1.forEach(System.out::println);
        };

}
