package practice_7v.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    private List<String> linkedList;
    //конструктор
    public Task1(){
        this.linkedList = new LinkedList<>(List.of("car","milk","cat","water","dog"));
    }
    //метод для вывода елементов списка
    public void printElement(){
       linkedList.forEach(System.out::println);
    }
}
