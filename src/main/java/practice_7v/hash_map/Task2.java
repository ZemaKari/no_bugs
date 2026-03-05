package practice_7v.hash_map;

import java.util.HashMap;

public class Task2 {
    private HashMap<String, Integer> book;

    // конструктор
    public Task2(){
        this.book = new HashMap<>();

    }
    //метод добавления елемента в коллекцию
     public void add(String name, Integer age){
        book.put(name.toLowerCase(), age);
     }
     // метод проверки имени в коллекции
    public void chackName(String name){
        if(book.containsKey(name.toLowerCase())){
            System.out.println("Такое имя есть");

        }else System.out.println("Такого имени нет");
    }
    //метод выводит на экран имя и возраст
    public void printBook(){
        book.forEach((name, age)->
        System.out.println("Имя: "+name+ ". " + "Возраст: "+ age));

    }
}

