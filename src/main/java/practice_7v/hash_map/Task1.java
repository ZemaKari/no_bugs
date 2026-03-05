package practice_7v.hash_map;

import java.util.HashMap;

public class Task1 {
    private HashMap<String, Integer> hashMap1;
    //конструктор класса Task1

    public Task1(){
        this.hashMap1 = new HashMap<>();

    }
    //метод добавляет ключ-значение в коллекцию

    public void addRecord(String name, Integer age){
        hashMap1.put(name, age);
    }
    //метод выводит карту на экран
    public void printMap(){
        hashMap1.forEach((name,  age)  ->{
            System.out.println("Имя: "+name+ ". " + "Возраст: "+ age);
        });
    }
}
