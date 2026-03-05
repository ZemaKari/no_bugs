package practice_7v.tree_set;

import java.util.TreeSet;

public class Task2 {
    private TreeSet<Integer> treeSet2;
    //конструктор

    public Task2(){
        this.treeSet2 = new TreeSet<>();

    }

    //метод  добавляет число в коллекцию TreeSet
    public void addNumber(Integer number){
        treeSet2.add(number);
    }
    public  void printTreeSet(){
        treeSet2.forEach(System.out::println);
    }
}
