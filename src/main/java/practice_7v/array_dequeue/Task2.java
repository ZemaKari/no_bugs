package practice_7v.array_dequeue;

import java.util.ArrayDeque;

public class Task2 {
    private ArrayDeque<String> arrayDeque2;

    //конструктор
    public Task2(){
        this.arrayDeque2 = new ArrayDeque<>();

    }

    // метод добавляет елемент
    public void addElement(String element){
        arrayDeque2.push(element);
    }

    // метод выводит элемент с хвоста очереди
    public void getElement(){
        while (!arrayDeque2.isEmpty()){
            System.out.println(arrayDeque2.pop());
        }
    }
}
