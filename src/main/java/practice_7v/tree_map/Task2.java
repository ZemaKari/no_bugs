package practice_7v.tree_map;

import java.util.TreeMap;

public class Task2 {
    private TreeMap<Integer, String> treeMap2;

    // конструктор
    public Task2() {
        this.treeMap2 = new TreeMap<>();

    }
    // метод добавляет элемент в коллекцию

    public void addElement(Integer number, String name) {
        treeMap2.put(number, name);
    }
    // метод который находит минимальный ключ

    public Integer minKey() {
        return treeMap2.firstKey();
    }
    // метод который находит максимальный ключ

    public Integer maxKey() {
        return treeMap2.lastKey();

    }
    public void printMap(){
        treeMap2.forEach((number, name)->{
            System.out.println("Номер:  "+ number +". "+  "Имя: "+ name );
        });
    }
}
