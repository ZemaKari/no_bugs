package practice_7v.linked_hash_set;

import java.util.LinkedHashSet;

public class Task1 {
    private LinkedHashSet<String> linkedHashSet1;

    //конструктор класса
    public Task1(){
        this.linkedHashSet1 = new LinkedHashSet<>();
    }
    //метод по добавлению элементов в коллекцию

    public void addElement(String element){
        linkedHashSet1.add(element);
    }
    //метод который выводит елементы
    public void printElement(){
        linkedHashSet1.forEach(System.out::println);
    }
}
