package practice_7v.priority_queue;

import java.util.PriorityQueue;

public class Task1 {
    private PriorityQueue<Integer> queue1;

    // конструктор класса
    public Task1(){
        this.queue1 = new PriorityQueue<>();
    }

    // метод для добавления числа
    public void addNumber(Integer number){
        queue1.offer(number);


    }
    // метод который возвращает элемент после удаления
    public void getElement(){
        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}
